package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsedProduct extends Product{

	private LocalDate manufacturedDate;

	public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public LocalDate getManufactureDate() {
		return manufacturedDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ manufacturedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
	
	
}
