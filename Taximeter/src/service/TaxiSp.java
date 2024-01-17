package service;


public class TaxiSp implements Taxi {

	private double price;
	private double metersCount;
	private int meters;
	private int stoppedMinutesCount;
	private double stoppedMinutes;

	
	public TaxiSp(int meters, int stoppedMinutesCount) {
		price = 5.50;
		this.metersCount = 0.009;
		this.meters = meters;
		this.stoppedMinutesCount = stoppedMinutesCount;
		this.stoppedMinutes = 0.50;
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
	
	

	public int getStoppedMinutesCount() {
		return stoppedMinutesCount;
	}

	public void setStoppedMinutesCount(int stoppedMinutesCount) {
		this.stoppedMinutesCount = stoppedMinutesCount;
	}

	public double getStoppedMinutes() {
		return stoppedMinutes;
	}

	public void setStoppedMinutes(double stoppedMinutes) {
		this.stoppedMinutes = stoppedMinutes;
	}

	@Override
	public double totalValue() {
		
		return getPrice() + meters * metersCount + (stoppedMinutes * stoppedMinutesCount + stoppedMinutesCount);
	}

	
}
