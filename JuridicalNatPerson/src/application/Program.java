package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.JuridicalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.println("Enter the number of taxes payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			
			
			System.out.print("Natural or Juridical Person (n/J) ? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			if(ch == 'n') {
				System.out.println("Annual Income: ");
				double annualNatIncome = sc.nextDouble();
				System.out.println("Health Expendure: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new NaturalPerson(name, annualNatIncome, healthExpenditure));
			}
			
			else {
				
				System.out.println("Annual Income");
				double annualIncome = sc.nextDouble();
				System.out.println("Number of employees: ");
				int numEmployee = sc.nextInt();
				list.add(new JuridicalPerson(name, annualIncome, numEmployee));
				
			}
		
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for(Person psn : list) {
			sum+= psn.calculateTaxes();
			System.out.println(psn.getName() + " $ " + String.format("%.2f", psn.calculateTaxes()));
	
		}
		System.out.println("TOTAL TAXES: $_" + String.format("%.2f", sum));

		sc.close();
		
	}

}
