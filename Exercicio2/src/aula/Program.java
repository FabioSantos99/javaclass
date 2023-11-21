package aula;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type dollar price: ");
		double dollar = sc.nextDouble();
		
		System.out.println("How much do you buy?: ");
		double buy = sc.nextDouble();
		
		double value = CurrencyConverter.cotationDollar(buy, dollar);
		
		
		System.out.printf("You have pay: " + CurrencyConverter.cotationDollar(buy, dollar) + " to buy " + buy);
		
		sc.close();
		

	}
	
	

}






