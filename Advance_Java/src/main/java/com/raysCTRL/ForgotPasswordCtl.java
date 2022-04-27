package com.raysCTRL;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raysModel.RegistrationModel;

public class ForgotPasswordCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ForgotPasswordCtl() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String e = request.getParameter("emailid");

		RegistrationModel u = new RegistrationModel();
		try {
			String pass = u.forgotEmail(e);
			request.setAttribute("pass", pass);
			request.setAttribute("error", "Invalid Email-ID");
			if (pass != null) {
				RequestDispatcher rd = request.getRequestDispatcher("ShowMyPassword.jsp");

				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("ForgotPasswordView.jsp");

				rd.forward(request, response);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

			doGet(request, response);
		}
	}
}
