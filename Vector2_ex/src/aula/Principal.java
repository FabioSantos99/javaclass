package aula;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantidade de numeros: ");
		int n = sc.nextInt();
				
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			
			vect[i] = sc.nextDouble();
			
		}
		
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
			
			sum += vect[i];
			
		}
		
		double total = sum;
		System.out.println(total);
		
	}

}
