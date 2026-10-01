package entidades;

public class product {
	public String name;
	public double price;
	public int quant;

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
		return name + ", $ " + String.format("%.2f", price) + ", " +
		quant + " units, Total: $ " + String.format("%.2f", totalPrice());
	}

}
