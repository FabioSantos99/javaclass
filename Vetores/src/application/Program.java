package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
444
			
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i<n; i++) {
			
			sum += vect[i];
			System.out.println(vect[i]);
		}
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		 
		
		sc.close();
	}

}
