package application;

import service.Taxi;
import service.TaxiRio;
import service.TaxiSp;

public class Program {

	public static void main(String[] args) {

		Taxi c1 = new TaxiSp(4664, 6);
		Taxi c2 = new TaxiRio(5566, 8);

		
		System.out.println("Total da Viagem: ");
		System.out.println(String.format("%.2f", c1.totalValue()));
		System.out.println(String.format("%.2f", c2.totalValue()));
	}

}
