package com.servlet;

import java.io.IOException;
import java.sql.Statement;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SignupServlet extends HttpServlet implements Instantiation{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		
		try 
		{		
		Statement statement=dbConnection.connecion();
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		String email = request.getParameter("email");
		String password=request.getParameter("password");
		
		boolean checkString=stringMethods.isNullOrEmpty(name)||stringMethods.isNullOrEmpty(age)||stringMethods.isNullOrEmpty(gender)||stringMethods.isNullOrEmpty(email)||stringMethods.isNullOrEmpty(password);
		
		if(checkString) {
			displayAlert.displayAlert("Please Enter the Credentials.",response);
			dispatcher.requestDispatcherSignup(request, response);
		}
		else {
			String query="insert into profile values(\"" +name+ "\"," +age+ ",\"" +gender+ "\",\"" +email+ "\",\"" +password+ "\");";
			int resultSet=statement.executeUpdate(query);
			
			if(resultSet>0) {
				displayAlert.displayAlert("Successfully Added.","Success",response);
				
				session.setAttribute("name", name);
				session.setAttribute("age",age);
				session.setAttribute("gender", gender);
				session.setAttribute("email", email);
				session.setAttribute("password", password);
				
				response.sendRedirect("Home.jsp");
			}			
		}
		}
		catch(MySQLIntegrityConstraintViolationException duplicateEmail) {
			displayAlert.displayAlert("This Email Already Signed",response);
			dispatcher.requestDispatcherSignup(request, response);
		}
		catch(Exception errorMessage) {
			displayAlert.displayAlert(errorMessage,response);
			dispatcher.requestDispatcherSignup(request, response);
		}
	}
	

}
