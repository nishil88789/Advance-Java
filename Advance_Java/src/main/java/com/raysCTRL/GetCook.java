package com.raysCTRL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/GetCookie")
public class GetCook extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public GetCook() {
        super();
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	Cookie[] cookies = request.getCookies();
	
	for(int i=0; i<cookies.length;i++) {
		Cookie c= cookies[i];
		
		String name = c.getName();
		String value = c.getValue();
		out.println(name+"="+value);
	}
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
