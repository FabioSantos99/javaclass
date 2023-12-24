package entities;

public class JuridicalPerson extends Person{
	
	private Double annualIncome;
	private int numEmployees;
	
	public JuridicalPerson() {
		super();
		
	}

	public JuridicalPerson(String name, Double annualIncome, int numEmployees) {
		super(name);
		this.annualIncome = annualIncome;
		this.numEmployees = numEmployees;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public int getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
	
	@Override
	public double calculateTaxes() {
		
		if(numEmployees > 10) {
			
			return (annualIncome * 14 / 100);
		}
		
		else {
			
			return (annualIncome * 15/100);
		}
	}
	
}
