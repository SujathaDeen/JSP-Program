package com.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	
	public Statement connecion() throws  SQLException, ClassNotFoundException {
		
	Class.forName ("com.mysql.jdbc.Driver") ;
	Connection connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fullcreative","root","");
	Statement statement=connection.createStatement();
	return statement;
	
	}
}
