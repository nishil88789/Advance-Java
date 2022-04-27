package com.raysCTRL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.raysBean.RegistrationBean;
import com.raysModel.RegistrationModel;

@WebServlet(urlPatterns = "/RegistrationCtl")
public class RgistrationCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Fname = request.getParameter("fname");
		String Lname = request.getParameter("lname");
		String Dob = request.getParameter("dob");
		String Email = request.getParameter("email");
		String Contact = request.getParameter("contact");
		String Gender = request.getParameter("gender");
		String Add = request.getParameter("add");
		String Lang = request.getParameter("subject");
		String Pwd = request.getParameter("pwd");

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println(Fname + " " + Lname + " " + Dob + " " + Email + " " + Contact + " " + Gender + " " + Add + " "
				+ Lang + " " + Pwd);

		RegistrationBean bean = new RegistrationBean();

		bean.setfName(Fname);
		bean.setlName(Lname);
		bean.setDob(Dob);
		bean.setAdd(Add);
		bean.setEmail(Email);
		bean.setContact(Contact);
		bean.setGender(Gender);
		bean.setLang(Lang);
		bean.setPwd(Pwd);

		RegistrationModel model = new RegistrationModel();

		try {
			model.testAdd(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}

		out.close();

		doGet(request, response);
	}

}
