package com.raysCTRL;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Session1() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		
		Date created = new Date(session.getCreationTime());
		Date accessed = new  Date(session.getLastAccessedTime());
		
		PrintWriter out = response.getWriter();
		
		out.println("ID"+session.getId());
		out.println("Created"+created);
		out.println("Last Accessed"+accessed);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
