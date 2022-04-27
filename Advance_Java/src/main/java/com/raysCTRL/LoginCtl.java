package com.raysCTRL;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raysBean.RegistrationBean;
import com.raysModel.RegistrationModel;

@WebServlet(urlPatterns = "/LoginCtl")
public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginCtl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");

		RegistrationBean bean = new RegistrationBean();
		bean.setEmail(user);
		bean.setPwd(pwd);

		try {
			if (RegistrationModel.authenticat(bean) == true) {
				RequestDispatcher rd = request.getRequestDispatcher("WelcomeCtl.do");
				rd.forward(request, response);
			} else if (user.equals(pwd)) {

				RequestDispatcher rd = request.getRequestDispatcher("LoginF.jsp");
				request.setAttribute("errorlogin", "Please Enter LoginID");
				request.setAttribute("errorpass", "Please Enter Password");
				rd.forward(request, response);
			} else if (user.equals(" ") || pwd.equals(" ")) {
				RequestDispatcher rd = request.getRequestDispatcher("LoginF.jsp");
				request.setAttribute("errorpass", "Please Enter Password");
				request.setAttribute("errorlogin", "Please Enter LoginID");
				rd.forward(request, response);
			} else if (user.equals("")) {

				RequestDispatcher rd = request.getRequestDispatcher("LoginF.jsp");
				request.setAttribute("errorlogin", " Enter LoginID");
				rd.forward(request, response);
			} else if (pwd.equals("")) {

				RequestDispatcher rd = request.getRequestDispatcher("LoginF.jsp");
				request.setAttribute("errorpass", " Enter Password");
				rd.forward(request, response);
			}

			else {
				RequestDispatcher rd = request.getRequestDispatcher("LoginF.jsp");
				request.setAttribute("eror", "Invalid User & pwd");
				rd.forward(request, response);

			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		doGet(request, response);
	}

}
