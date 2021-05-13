package com.servlet;

public class StringMethods {
	
	public boolean isNullOrEmpty(String string) {
		
		return string.isEmpty()||string.isBlank()||string==null;
		
	}
	
}
