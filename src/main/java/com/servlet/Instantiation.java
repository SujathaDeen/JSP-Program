package com.servlet;

import java.io.PrintWriter;
import java.util.logging.Logger;

import jakarta.servlet.http.HttpSession;

public interface Instantiation {
	
	DisplayAlert displayAlert=new DisplayAlert();
	DataBaseConnection dbConnection=new DataBaseConnection();
	NextDispatcher dispatcher=new NextDispatcher();
	StringMethods stringMethods=new StringMethods();
	
}
