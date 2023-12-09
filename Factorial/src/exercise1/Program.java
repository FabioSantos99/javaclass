package exercise1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Factorial count1 = new Factorial(4);
		
		System.out.println("The factorial " + count1.x + 
				" is: " + count1.factorial());
	}

}
