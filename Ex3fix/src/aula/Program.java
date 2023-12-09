package aula;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;


public class Program {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		
		
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		System.out.println();
	
		
		System.out.println("Enter account holder: ");
		String holder = sc.next();
		System.out.println();

		System.out.println("Enter a deposit value: ");
		
		double deposit = sc.nextDouble();
		System.out.println();
		
		
		System.out.println("Updated account data: ");
		System.out.println();

		System.out.println(" ");
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		System.out.println("Updated account data: ");
		
		sc.close();
		
	}

}
