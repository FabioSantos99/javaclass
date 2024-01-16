package application;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Bob", "maria@email.com");
		Cliente c2 = new Cliente("Bob", "maria@email.com");
		
		String s1 = "Test";
		String s2 = "Test";

		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);

	}

}
