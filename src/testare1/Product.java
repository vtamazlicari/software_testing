package testare1;

public class Product {
	String name;
	int price;
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
    public int getPrice() {
	return this.price;
    }
    
    public String getName() {
	return this.name;
    }
   
}
