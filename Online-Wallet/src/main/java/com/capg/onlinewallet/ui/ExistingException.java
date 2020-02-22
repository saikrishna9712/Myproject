package com.capg.onlinewallet.ui;

@SuppressWarnings("serial")
public class ExistingException extends Exception{

	public ExistingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  ExistingException(String message) {
		
		super(message);
		
		}
	public void InputMismatchException() {
		System.out.println("Invalid Entry");
	}
	
	

}
