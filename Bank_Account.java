package com.bankingapplication;

import java.util.Scanner;

public class Bank_Account {

	int balance;
	
	int previousTransaction;
	
	String customerName;
	
	String customerId;
	
	public Bank_Account(String cname,String cid) {
		
		customerName = cname;
		
		customerId =cid;
	}
	
	
	public void deposit(int amount) {
		
		if(amount !=0) {
		
		balance = balance +amount;
		
		previousTransaction = amount;
	}
}
	
	public void withdraw(int amount) {
		
		if(amount !=0) {
			
			balance = balance +amount;
			
			previousTransaction = amount;
		}
	}
	
	public void getPreviousTransaction() {
		
		if(previousTransaction > 0) {
			
			System.out.println("Deposit amount is: " + previousTransaction);
			
		}else if(previousTransaction > 0) {
			
			System.out.println("Withdraw Amount is: "+ Math.abs(previousTransaction));
			
		}else {
			System.out.println("No Transaction occured");
		}	
	}
	
	public void showMenu() {
		
		char option ='\0';
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Welcome " + customerName);
			
			System.out.println("Your id is" + customerId);
			
			System.out.println("\n");
			
			System.out.println("A. Check Balance ");
			
			System.out.println("B. Deposit ");
			
			System.out.println("C. Withdraw ");
			
			System.out.println("D. PreviousTransaction ");
			
			System.out.println("        EXIT        ");
			
			
			
			
			do {
				
				System.out.println("*****************************************************");
				
				System.out.println("Enter the option");
				
				System.out.println("*****************************************************");
				
				option = sc.next().charAt(0);
				
				switch(option) {
				
				case 'a':
					
				   System.out.println("-----------------------------------------------------------");
				
				   System.out.println("Balance = " + balance);
				
				   System.out.println("-----------------------------------------------------------");
				
				   System.out.println("\n");
				
				break;
				
				
				case 'b':
				
					System.out.println("-----------------------------------------------------------");
					
					System.out.println("Enter an amount to Deposit");
					
					System.out.println("-----------------------------------------------------------");
					
					int amount = sc .nextInt();
					
					deposit(amount);
					
					System.out.println("\n");
				
				    break;
				
				case 'c':
					
			        System.out.println("-----------------------------------------------------------");
					
					System.out.println("Enter an amount to Withdraw");
					
					System.out.println("-----------------------------------------------------------");
					
					int amount2 = sc .nextInt();
					
					deposit(amount2);
					
					System.out.println("\n");
				
					break;
					
				case 'd':
					
					System.out.println("--------------------------------------------------------");
					
					getPreviousTransaction();
					
					System.out.println("--------------------------------------------------------");
					
					break;
					
				case 'e':
					
					System.out.println("--------------------------------------------------------");
				
				    break;
				    
				default:
					System.out.println(" Invalid Option!!!, Please Enter Again ");
					
				}
			}while(option !='e');
		}
		
		System.out.println("Thank you for using our services");
			
		
			
			}

		

	}
	
	
	
	
	
	

