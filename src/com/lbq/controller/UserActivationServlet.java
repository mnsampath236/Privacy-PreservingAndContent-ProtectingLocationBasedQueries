package com.lbq.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbq.dao.UserDaoImpl;
import com.lbq.model.User;

/**
 * Servlet implementation class UserActivationServlet
 */
@WebServlet("/UserActivationServlet")
public class UserActivationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserActivationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String user = (String)request.getParameter("userid");
		String activate = (String)request.getParameter("active");
		if(null != user && null != activate) {
			if("active".equalsIgnoreCase(activate)) {
				new UserDaoImpl().acivateUser(new User(null, null, null, null, user, null, 1));
			}else {
				new UserDaoImpl().deactivateUser(new User(null, null, null, null, user, null, 0));
			}
		}
		request.getRequestDispatcher("./UsersControllPannel").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
