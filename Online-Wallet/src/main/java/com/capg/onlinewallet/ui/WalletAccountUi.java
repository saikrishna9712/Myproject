package com.capg.onlinewallet.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capg.onlinewallet.model.WalletAccount;
import com.capg.onlinewallet.service.WalletAccountService;
import com.capg.onlinewallet.service.WalletAccountServiceImpl;
import com.capg.onlinewallet.ui.ExistingException;


public class WalletAccountUi {
	
    static WalletAccount accobj=new WalletAccount();
    static WalletAccountService walletservice=new WalletAccountServiceImpl();
    static Scanner in=new Scanner(System.in);
	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		for(;;) {
		try {	
		System.out.println("Enter your choice");
		System.out.println("1. Create an Account");
		System.out.println("2. login");
		System.out.println("3. Exit");
		
		int n=in.nextInt();
		
	
		
		
		switch (n) {
		case 1:
			System.out.println("\n\tCREATE AN ACCOUNT");
			
			System.out.println("Enter your Name");
			String s=in.next();
		 
		    System.out.println("Enter UserName");
			String s1=in.next();
			
			System.out.println("Enter Password");
			String pass=in.next();
	        
			try {
				WalletAccount newacc=walletservice.createAccount(s,s1,pass);
				 
		       System.out.println("\n\tACCOUNT CREATED SUCCESSFULLY");
		       System.out.println("\nAccount Details are");
			   System.out.println(newacc);
			}
			catch(ExistingException e) {
				System.out.println("Error: "+e.getMessage());
			}
			break;
		case 2:
			System.out.println("Enter UserName");
			String uname=in.next();
			System.out.println("Enter Password");
			String pas=in.next();
			try {
		  walletservice.checkDetails(uname,pas);
		  System.out.println("Login Successful");
		 
			}
			catch(ExistingException e) {
				System.out.println("Error: "+e.getMessage());
			}
			break;
		default:
			System.out.println("Enter a Valid option");
		
		}
}
		
		catch(InputMismatchException e) {
			System.out.println("Error "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
			
		}
		
	}
	
}

		
