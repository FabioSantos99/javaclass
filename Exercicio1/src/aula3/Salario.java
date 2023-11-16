package aula3;

public class Salario {
	
	public double salario;
	public double taxa;
	public double aumento;
	public String nome;
	
	
	public double taxaDesconto() {
		
		return salario - taxa;
		
	}
	
	public double aumentoSalario() {
		
		return taxaDesconto() * aumento / 100 + taxaDesconto();
	}


}
