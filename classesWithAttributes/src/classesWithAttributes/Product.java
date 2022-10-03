package classesWithAttributes;

public class Product {
	private int Id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;

	public String getKod() {
		return this.name.substring(0, 1) + this.Id;
	}

	// getter blogu
	public int getId() {
		return Id;
	}

	// setter blogu
	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

}
