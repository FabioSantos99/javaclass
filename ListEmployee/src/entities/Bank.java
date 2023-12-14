package entities;

public class Bank {
	
	private int accountN;
	
	private String name;
	
	private double value;

	public Bank(int accountN, String name, double value) {
		
		this.accountN = accountN;
		this.name = name;
		this.value = value;
	}

	public int getAccountN() {
		return accountN;
	}

	public void setAccountN(int accountN) {
		this.accountN = accountN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	public void deposit() {
		
		value += value;
	}
	
	
	public void withdraw() {
		
		value -= value;
	}
	

}
