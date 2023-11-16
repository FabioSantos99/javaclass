package aula2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Grade mario = new Grade();
		
		System.out.println("Enter with the three grades: ");
		
		mario.grade1 = sc.nextDouble();
		mario.grade2 = sc.nextDouble();
		mario.grade3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", mario.finalGrade());
		
		if (mario.finalGrade() < 60 ) {
			
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", mario.missingPoints());
			
			
		} else {
			
			System.out.println("PASS");
			
		}
		sc.close();

	}

}
