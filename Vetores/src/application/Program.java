package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de num que serão digitados: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i = 0; i<n; i++) {
			
			vetor[i] = sc.nextDouble();
			System.out.println(vetor[i]);
			
		}
		
		double soma = 0.0;
		for (int i = 0; i<n; i++) {
			
			soma+= vetor[i];
		}
		
		double media = soma / n;
		
		System.out.printf("Media: %.2f%n", media);
		
	}

}
