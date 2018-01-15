public abstract class Product {

	// Fields
	private String name;
	private int serialNum;
	private double price;
	
	
	// Constructors
	public Product(String name, int serialNum, double price){
		this.name = name;
		this.serialNum = serialNum;
		this.price = price;
	}

	public Product(Product product) {
	    this(product.name, product.serialNum, product.price);
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
