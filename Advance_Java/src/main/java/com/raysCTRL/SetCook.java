package com.raysCTRL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SetCook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SetCook() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	response.setContentType("text/html");
	PrintWriter out =response.getWriter();
	
	String name = request.getParameter("Ram");
    String value = request.getParameter("Ram1234");
	Cookie c =  new Cookie(name, value);
	c.setMaxAge(24*60*60);
	response.addCookie(c);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
