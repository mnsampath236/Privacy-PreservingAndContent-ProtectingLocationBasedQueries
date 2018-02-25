package com.lbq.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbq.dao.HistoryDaoImpl;
import com.lbq.model.History;
import com.lbq.model.User;

/**
 * Servlet implementation class MapAction
 */
@WebServlet("/MapAction")
public class MapAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MapAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String searchKey = (String) request.getParameter("searchKey");
		String location = (String) request.getParameter("location");
		User user = (User) request.getAttribute("user");
		new HistoryDaoImpl().recordSearchHistory(new History(0, (user!=null)?user.getUserId():"", searchKey+ " , " + location, new Date()));
		request.setAttribute("searchKey", searchKey + " , " +location);
		request.getRequestDispatcher("./Map.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
