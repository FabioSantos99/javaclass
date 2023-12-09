package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		
		System.out.println("How many rooms will be rented? ");
		
		int n = sc.nextInt();
		
		for (int i =1; i<=n; i++) {
			
			System.out.println();
			System.err.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Room: ");
			int roomNumber = sc.nextInt();

			Rent rent = new Rent(name, email);
			
			rooms[roomNumber] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < 10; i++) {
			
			if(rooms[i] != null) {
				
				System.out.println(i + ": " + rooms[i]);

			}
		}
		sc.close();
	}

}
