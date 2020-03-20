package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactoreDate;
	

	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactoreDate) {
		super(name, price);
		this.manufactoreDate = manufactoreDate;
	}

	public Date getManufactoreDate() {
		return manufactoreDate;
	}

	public void setManufactoreDate(Date manufactoreDate) {
		this.manufactoreDate = manufactoreDate;
	}
	
	@Override
	public String priceTag() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ sdf.format(manufactoreDate)
				+ ")";
	}
	
}
