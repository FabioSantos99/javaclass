package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Bank> list = new ArrayList<>();
		
		System.out.println("How many account do you put here? ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			System.out.println();
			System.out.println("Account number: ");
			Integer accountN = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Value: ");
			Double value = sc.nextDouble();
			
			Bank bk = new Bank(accountN, name, value);
			
			list.add(bk);
					
		}
		
		sc.close();

	}
	
	public static String positionName(List<Bank> list, String name) {
		
		for (int i = 0; i<list.size(); i++) {
			
			if(list.get(i).getName()==name) {
				
				return name;
			}
		}
		return name;
		
		
	}

}
