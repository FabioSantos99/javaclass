package service;


public class TaxiRio implements Taxi {

	private double price;
	private double metersCount;
	private int meters;
	private double stoppedMinutes;
	private int stoppedMinutesCount;

	
	public TaxiRio(int meters, int stoppedMinutesCount) {
		price = 6.00;
		this.metersCount = 0.008;
		this.meters = meters;
		stoppedMinutes = 0.45;
		this.stoppedMinutesCount = stoppedMinutesCount ;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMeters() {
		return meters;
	}

	public void setMeters(int meters) {
		this.meters = meters;
	}
	
	public double getMetersCount() {
		return metersCount;
	}

	public void setMetersCount(double metersCount) {
		this.metersCount = metersCount;
	}

	@Override
	public double totalValue() {
		
		return getPrice() + meters * metersCount + (stoppedMinutes * stoppedMinutesCount + stoppedMinutesCount);
	}

	
}
