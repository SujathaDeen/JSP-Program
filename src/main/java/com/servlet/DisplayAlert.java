package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayAlert extends HttpServlet{
	
	public void displayAlert(String alertMessage, HttpServletResponse response) throws IOException {
		PrintWriter printWriter=response.getWriter();
		printWriter.println("<html><body><div class=\"container alert alert-danger\" style=\"width:80%;text-align:center;\">\r\n"
				+ "    <strong>Warning! </strong>");
		printWriter.println(alertMessage);
		printWriter.println( " </div></body></html>");
				
	}
	
	public void displayAlert(String successMessage,String success, HttpServletResponse response) throws IOException {
		PrintWriter printWriter=response.getWriter();
		printWriter.println("<html><body><div class=\"container alert alert-success\" style=\"width:80%;text-align:center;\">\r\n"
				+ "    <strong>Warning! </strong>");
		printWriter.println(successMessage);
		printWriter.println( " </div></body></html>");
				
	}
	
	public void displayAlert(Exception errorMessage, HttpServletResponse response) throws IOException {
		PrintWriter printWriter=response.getWriter();
		printWriter.println("<html><body><div class=\"container alert alert-danger\" style=\"width:80%;text-align:center;\">\r\n"
				+ "    <strong>Warning! </strong>");
		printWriter.println(errorMessage);
		printWriter.println( " </div></body></html>");
				
	}
}
