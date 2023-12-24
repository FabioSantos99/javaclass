package entities;

public class NaturalPerson extends Person{
	
	private double annualNatIncome;
	private double healthExpenditure;
	
	public NaturalPerson(String name, double annualNatIncome, double healthExpenditure) {
		super(name);
		this.annualNatIncome = annualNatIncome;
		this.healthExpenditure = healthExpenditure;
	}

	public double getAnnualNatIncome() {
		return annualNatIncome;
	}

	public void setAnnualNatIncome(double annualNatIncome) {
		this.annualNatIncome = annualNatIncome;
	}

	public double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}
	
	
	public double calculateTaxes() {
		
		if (getAnnualNatIncome() > 20000.0) {
			
			return getAnnualNatIncome() * 0.25 + healthExpenditure * 0.5;
		}

		else {
			
			 return getAnnualNatIncome() * 0.15 + healthExpenditure * 0.5;

		}
	
	}
		
}
	
	
	


