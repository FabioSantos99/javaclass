package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("TTabletV", 350.00));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1;
		// Consumer<Product> cons = ;
		
		list.forEach(p -> 
		p.setPrice(p.getPrice() * factor));
		
		list.forEach(System.out::println);
		
		
		
		
		
		
		
		
		/*double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product p : list) {
			System.out.println(p);
		} */
	}

}