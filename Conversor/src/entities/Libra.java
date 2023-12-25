package entities;

public class Libra extends Cambio {

	private double priceLibra;

	public Libra() {
		
	}
	
	public Libra(double priceLibra) {
		this.priceLibra = priceLibra;
	}

	public double getPriceLibra() {
		return priceLibra;
	}

	public void setPriceLibra(double priceLibra) {
		this.priceLibra = priceLibra;
	}
	
	public double conversor() {
		
		return getValue() * priceLibra;
	}
	
	
}
