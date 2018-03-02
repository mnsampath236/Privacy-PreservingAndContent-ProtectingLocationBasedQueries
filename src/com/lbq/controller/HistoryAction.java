package com.lbq.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbq.dao.HistoryDao;
import com.lbq.dao.HistoryDaoImpl;
import com.lbq.model.History;
import com.lbq.model.User;

/**
 * Servlet implementation class HistoryAction
 */
@WebServlet("/HistoryAction")
public class HistoryAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistoryAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		User user = (User) request.getSession().getAttribute("user");
		History history = new History();
		history.setUserId(user.getUserId());
		String date = (String)request.getParameter("date");
		System.out.println("Date :::::::::::::::::::::::: " + date + " : user : " + user.getUserId());
		LocalDate localDate = LocalDate.parse(date);
		Date d = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		history.setDate(d);
		HistoryDao hd = new HistoryDaoImpl();
		List<History> searchHistoryByDate = hd.getSearchHistoryByDate(history);
		request.setAttribute("historyView", searchHistoryByDate);
		request.getRequestDispatcher("./HistoryView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
