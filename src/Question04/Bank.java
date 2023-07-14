package Question04;

import java.util.Scanner;

/*
 4. Create a Java program that simulates a bank account. The program should allow
	users to deposit and withdraw money, check their balance. 
 */

public class Bank {

	public static void main(String[] args) throws Exception {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("WELCOME TO BANK OF INDIA");
		System.out.println("*************************");
		
		System.out.print("Enter account holder name :: ");
		String name = scanner.next();
		
		System.out.print("Enter account holder ID :: ");
		String ID = scanner.next();
		
		BankAccount account = new BankAccount(name, ID);

	
		System.out.println();
		System.out.println("Welcome " + account.getCustomerName());
		System.out.println("Your ID  is :: " + account.getCustomerId());

		while (true) {
			System.out.println("\n");
			System.out.println("1. CHECK ACOUNT BALANCE");
			System.out.println("2. DEPOSIT");
			System.out.println("3. WITHDRAW");
			System.out.println("4. EXIT");
			System.out.print("ENTER YOUR CHOICE, PRESS[1/2/3/4]::  ");
			String option = scanner.next();

			switch (option) {
			case "1":
				System.out.println("Balance = " + account.getBalance());
				break;
			case "2":
					System.out.print("Enter an amount to deposit :: ");
					int amount = scanner.nextInt();
					String status = account.depositAmount(amount);
					if (status.equalsIgnoreCase("success")) {
						System.out.println("Amount deposited successfully...");
						break;
					} else {
						System.out.println("Deposition failed...");
						break;
					}
				
			case "3":
					System.out.print("Enter an amount to withdraw :: ");
					int withdrawAmount = scanner.nextInt();
					String msg = account.withdrawAmount(withdrawAmount);

					if (msg.equalsIgnoreCase("success")) {
						System.out.println("withdrawal successfully...");
						break;
					} else {
						System.out.println("withdrawal failed...");
						break;
					}
					
			case "4":
					System.out.println("******* Thanks for using the application *****");
					System.exit(0);
			default:
					System.out.println("Invalid option plz try agin with valid options....");
					break;
			}
			
		}

	}

}
