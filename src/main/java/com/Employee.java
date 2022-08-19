package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Employee extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	  protected void doPost(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException { 
		  
		  // TODO Auto-generated method stub
	  //response.getWriter().append("Served at: ").append(request.getContextPath()) ;
		 //System.out.println("hai");
	  
	  
	  
	  PrintWriter writer = response.getWriter();
	  String name = request.getParameter("name"); 
	  
	  writer.println("Welcome "+name );
	  String password = request.getParameter("password");
	  if(password.equals("1234")) {
		  RequestDispatcher rd=request.getRequestDispatcher("WelcomePath"); 
		  rd.forward(request,response);
	  }
	  else
	  {
	  writer.print("Sorry!!Entered a wrong password.Try again!");
	  RequestDispatcher rd=request.getRequestDispatcher("/login.html");
	  rd.include(request,response); 
	  }
	  
	  writer.close(); 
	  
	 }
	 
	

}
