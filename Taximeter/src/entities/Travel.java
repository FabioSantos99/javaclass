package entities;

import java.time.LocalDate;

public class Travel {
	
	private double price;
	private double meters;
	private double totalValue;
	
	
	public Travel() {
		
	}

	public Travel(double meters, double totalValue) {
		price = 5.50;
		this.meters = meters;
		this.totalValue = totalValue;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMeters() {
		return meters;
	}

	public void setMeters(double meters) {
		this.meters = meters;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	
	

}
