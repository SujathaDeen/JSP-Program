package com.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet implements Instantiation{

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		Logger log=Logger.getLogger(HomeServlet.class.getName());
		
		try {
	
	}		
		catch(Exception errorMessage){
			displayAlert.displayAlert(errorMessage,response);
			dispatcher.requestDispatcherSignin(request, response);
	}
}
}
