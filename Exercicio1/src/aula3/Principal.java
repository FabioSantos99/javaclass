package aula3;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario empregado = new Salario();
		
		System.out.println("Digite seu nome: ");
		empregado.nome = sc.nextLine();
		
		System.out.println("Digite seu salario: ");
		empregado.salario = sc.nextDouble();
		
		System.out.println("Digite a taxa: ");
		empregado.taxa = sc.nextDouble();
		
		System.out.println("Digite a porcentagem de aumento salarial: ");
		empregado.aumento = sc.nextDouble();
		
		
		System.out.println(empregado.nome + " Seu Salario: " + 
		empregado.salario + " Taxa: " +empregado.taxa + " Aumento: "
				+ empregado.aumento + "% " + " Total descontado com a taxa: "
						+ empregado.taxaDesconto() + " Aumento Salarial: " +
				empregado.aumentoSalario());

	}

}
