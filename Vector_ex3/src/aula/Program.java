package aula;

import java.util.Locale;
import java.util.Scanner;

import entities.Datas;

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Datas[] vect = new Datas[n];
		
		
		for(int i=0; i<vect.length; i++) {
			
			System.out.println("first person data: ");
			
			System.out.println();
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println();
			System.out.println("Age: ");
			int age = sc.nextInt();
			
			System.out.println();
			System.out.println("Height: ");
			double height = sc.nextDouble();
			vect[i] = new Datas(name, age, height);
			
		}
		
		double sum = 0.0;
		
		for(int i=0; i<vect.length; i++) {
			
			sum += vect[i].getHeight();
		
		}
		
		double avg = sum / vect.length;
		
		
		int count = 0;

		for(int i=0; i<vect.length; i++) {
			
			
			if(vect[i].getAge() < 16) {
				

				count = count + 1;
			}
			
		}
		
		double percent = count * 100.0 / n;
		
		
		System.out.println();
		System.out.printf("The Average height is: %.2f%n", avg);
		System.out.printf("Peope have less than 16 years old: %.1f%%%n",percent);		
		sc.close();
		
	}
}
