package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servletcontxt2 extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		try {
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			
			
			ServletContext context=getServletContext();
			
			
			writer.println("Hello from servlet class2");
			
			String company=(String)context.getAttribute("company");;
			writer.println(company);
			
			writer.close();
			
		}catch(Exception e) {
			e.getMessage();
		}
	}


}
