package com.devops.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.devops.dao.CustomerDAO;
import com.devops.util.MyValidator;

/**
 * Servlet implementation class CustomerLogin
 */
@WebServlet("/customerLogin")
public class CustomerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public CustomerLogin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter()
				.append(" Congrats..!! your Application is running and successfully deployed..!!")
				.append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("username");
		String password = request.getParameter("userpass");

		HttpSession session = request.getSession();
		if (session != null)
			session.setAttribute("name", userName);

		if (MyValidator.getInstance().validateFieldsAreNotEmpty(userName,
				password)) {
			// removed hardcoded validation
			// if (MyValidator.getInstance().isUserAuthenticated(userName,
			// password)) {

			if (CustomerDAO.validate(userName, password)) {
				RequestDispatcher rd = request
						.getRequestDispatcher("welcome.jsp");
				rd.include(request, response);
			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("error.jsp");
				rd.include(request, response);
			}
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
		}

		out.close();
	}

}
