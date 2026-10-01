package entities;

public class Product {
	private String name;
	private double price;
	private int quant;

	public Product(String name, double price, int quant) {
		this.name = name;
		this.price = price;
		this.quant = quant;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double totalPrice() {
		double total;
		total = price * quant;
		return total;
	}
	public void addProduct(int quantity) {
		this.quant += quantity;
	}
	public void removeProduct(int quantity) {
		this.quant -= quantity;
	}
	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quant 
				+ " units, Total: $ "
				+ String.format("%.2f", totalPrice());
	}
}
