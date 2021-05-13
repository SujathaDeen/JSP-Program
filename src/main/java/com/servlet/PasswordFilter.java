package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebFilter("/Signup")
public class PasswordFilter implements Filter {

    
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest=(HttpServletRequest) request;
		HttpServletResponse httpResponse=(HttpServletResponse) response;
		
		PrintWriter printWriter = response.getWriter();
		Logger log=Logger.getLogger(PasswordFilter.class.getName());
		DisplayAlert displayAlert=new DisplayAlert();
		
		try {
		String password=httpRequest.getParameter("password");
		
		//String regex = "^[a-zA-Z0-9+_.-][!@#$%^&*()][a-zA-Z0-9.-]+$";
		 
		if(password.length()>=8){		
			chain.doFilter(request, response);
		} 
		
		else {
			displayAlert.displayAlert("Password should be Minimum 8 Characters.",httpResponse);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Signup.html");
			requestDispatcher.include(request, response);
		}
		}
		
		catch(Exception errorMessage){
			displayAlert.displayAlert("errorMessage.",httpResponse);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Signup.html");
			requestDispatcher.include(request, response);
		}
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
