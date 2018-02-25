package com.lbq.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String loginResponse = Constants.FAIL;
		String username= (String) request.getParameter("email");
		String password = (String) request.getParameter("password");
		User user = new User();
		user.setUserId(username);
		user.setPassword(password);
		UserDao dao = new UserDaoImpl();
		User loginResult = dao.login(user);
		HttpSession session = request.getSession();
		request.setAttribute("user", loginResult );
		
		if(loginResult!=null && "admin@email.com".equalsIgnoreCase(username)) {
			loginResponse= Constants.SUCCESS;
			request.getRequestDispatcher("./AdminHome.jsp").forward(request, response);
		}else if(loginResult!=null && loginResult.getActive() != 0) {
			loginResponse= Constants.SUCCESS;
			request.getRequestDispatcher("./UserOperations.jsp").forward(request, response);
		}else if(loginResult!=null && loginResult.getActive() == 0){
			loginResponse= Constants.IN_ACTIVE;
			request.getRequestDispatcher("./UserOperations.jsp").forward(request, response);
		}else {
			loginResponse= Constants.FAIL;
			request.getRequestDispatcher("./UserOperations.jsp").forward(request, response);
		}
		session.setAttribute("loginResponse", loginResponse);
		Logger.getLogger(LoginServlet.class.getName()).log(Level.INFO, "LoginServlet loginResponse : " + loginResponse);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
