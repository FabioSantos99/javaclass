package entities;

import java.security.InvalidParameterException;

import service.InterestService;

public class USAInterestService2 implements InterestService{

	private double interestRate;
	
	public USAInterestService2(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
}