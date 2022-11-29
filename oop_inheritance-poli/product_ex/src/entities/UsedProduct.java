package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
	}
	
	public UsedProduct(String name, Double price, Date manufacturedate) {
		super(name, price);
		this.manufactureDate = manufacturedate;
	}

	public Date getManufacturedate() {
		return manufactureDate;
	}

	public void setManufacturedate(Date manufacturedate) {
		this.manufactureDate = manufacturedate;
	}
	
	@Override
	public final String priceTag() {
		return name + " (used) $ " + price
				+ " (Manufacture date: "
				+ sdf.format(manufactureDate);
	}
}
