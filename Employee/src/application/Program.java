package application;

import java.util.List;
import java.util.ArrayList;

import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employees> list = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i =0; i < n; i++) {
			
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ": ");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employees emp = new Employees(id, name, salary);
			
			list.add(emp);
			
		}
		
		System.out.println("Enter the employee id that will have"
				+ "salary increase : ");
		int idsalary = sc.nextInt();
		
		Employees emp = list.stream().filter(x-> x.getId() == idsalary).findFirst().orElse(null);
		
		// Integer pos = position(list, idsalary);
		
		if(emp == null) {
			
			System.out.println("This id does not exist!");
		}
		else {
			
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
			
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employees e: list) {
			
			System.out.println(e);
		}
		
		sc.close();
		 
	}
	
	public static Integer position(List<Employees> list, int id) {
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).getId()==id) {
				
				return i;
				
			}
		}
		 return null;
	}
	
}
