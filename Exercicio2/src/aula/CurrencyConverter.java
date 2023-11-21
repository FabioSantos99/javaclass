package aula;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double cotationDollar(double buy, double dollar) {
		
		double total = buy * dollar;
		
		
		return total * IOF + total;
		

		
	}

	
	

}
