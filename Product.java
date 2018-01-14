public abstract class Product {

	// Fields
	private String name;
	private int serialNum;
	private double price;
	
	
	// Constructors
	public Product(String name, int serialNum, double price){
		// implement
	}
	
	public double getProductPrice() {
		return this.price;
	}

	// Methods
	public abstract double[] computeFinalPrice();
	
	/*
	* ADD YOUR METHODS BELOW
	*/
}
