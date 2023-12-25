package entities;

public class Dollar extends Cambio{
	private double priceDollar;

	
	
	public Dollar(String name, double value, double priceDollar) {
		super(name, value);
		this.priceDollar = priceDollar;
	}

	public double getPriceDollar() {
		return priceDollar;
	}

	public void setPriceDollar(double priceDollar) {
		this.priceDollar = priceDollar;
	}
	
	public double conversor() {
		
		return getValue() * priceDollar;
	}
	
	
}
