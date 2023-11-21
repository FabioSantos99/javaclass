package room;

import java.util.Locale;
import java.util.Scanner;
import newclass.Converter;



public class Principal {
	
	public static void main(String[] args) {
				
		Locale.setDefault(Locale.US);
		Scanner tp = new Scanner(System.in);
		
		System.out.println("How much do you want to buy?: ");
		double buyDollar = tp.nextDouble();
		
		double totalToPay = Converter.converterDollarReal(buyDollar);
		
		System.out.printf("You need to pay in real: %.2f%n ", totalToPay);
		
		
	}
	
	
	
	

}
