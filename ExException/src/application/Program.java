package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String name = sc.nextLine();
		System.out.println("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.println("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		
		Account acc = new Account(number, name, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	
	}
	
	
	
	
}

