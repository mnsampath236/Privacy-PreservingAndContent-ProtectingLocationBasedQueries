package com.lbq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbq.dao.UserDao;
import com.lbq.dao.UserDaoImpl;
import com.lbq.model.User;
import com.lbq.util.Constants;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor. 
	 */
	public LoginServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username= (String) request.getParameter("email");
		String password = (String)request.getParameter("password");
		PrintWriter out = response.getWriter(); 
		User user = new User();
		user.setUserId(username);
		user.setPassword(password);
		UserDao dao = new UserDaoImpl();
		String loginResp = dao.login(user);
		request.setAttribute("loginResp", loginResp);
		request.setAttribute("userId", username );
		if("admin@email.com".equalsIgnoreCase(username)) {
			request.getRequestDispatcher("./AdminHome.jsp").forward(request, response);
		}else if(Constants.SUCCESS.equalsIgnoreCase(loginResp)) {
			request.getRequestDispatcher("./UserOperations.jsp").forward(request, response);
		}else {
			out.print("<script>alert('Login Fail.');</script>");
			request.getRequestDispatcher("./UserLogin.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
