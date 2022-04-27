package com.raysCTRL;
import java.io.IOException;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"*.do"})
public class FrontController implements Filter {

	public FrontController() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;

		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null) {
			request.setAttribute("eror", "Session Expired, Please Login");
			RequestDispatcher rd = request.getRequestDispatcher("LoginF.jsp");
			rd.forward(request, response);
		} else {

			chain.doFilter(req, res);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}