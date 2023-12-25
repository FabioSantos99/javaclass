package entities;

public class Euro extends Cambio {
	
	private double priceEuro;

	public Euro(String name, double value, double priceEuro) {
		super(name, value);
		this.priceEuro = priceEuro;
	}

	public double getPriceEuro() {
		return priceEuro;
	}

	public void setPriceEuro(double priceEuro) {
		this.priceEuro = priceEuro;
	}
	
	
	public double conversor() {
		
		return getValue() * priceEuro;
	}
	

	

}
