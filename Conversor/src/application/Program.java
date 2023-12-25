package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cambio;
import entities.Dollar;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Cambio> list = new ArrayList<>();
		
		System.out.print("Enter with your name: ");
		sc.next();
		String name = sc.nextLine();
		System.out.println("Choose the currency to buy: Dollar, Euro, Libra (d/e/l) ");
		char ch = sc.next().charAt(0);
		
		if (ch == 'd') {
			
			System.out.println("How do you want to buy?: ");
			double value = sc.nextDouble();
			System.out.println("Dollar Price: ");
			double priceDollar = sc.nextDouble();
			list.add(new Dollar(name, value, priceDollar));
			
		}
		
		else if (ch == 'e') {
			
			System.out.println("How do you want to buy in real?: ");
			double value = sc.nextDouble();
			System.out.println("Euro Price: ");
			double priceEuro = sc.nextDouble();
			list.add(new Dollar(name, value, priceEuro));
		}
		 
		else {
			System.out.println("How do you want to buy?: ");
			double value = sc.nextDouble();
			System.out.println("Libra Price: ");
			double priceLibra = sc.nextDouble();
			list.add(new Dollar(name, value, priceLibra));
		}
		
		System.out.println();
		System.out.println("Total convertido: ");
		
		for(Cambio cmb : list) {
			System.out.println("Euro/Libra/Dollar: " 
					+ String.format("%.2f", cmb.conversor()));
		}
		
		
		sc.close();
	}

}
