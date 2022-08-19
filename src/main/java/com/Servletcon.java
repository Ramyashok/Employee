package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servletcon extends HttpServlet {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("name");
		PrintWriter writer=response.getWriter();
		writer.println("hello"+name);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}


}
