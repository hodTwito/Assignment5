public abstract class Product {

	private String name;
	private int serialNum;
	private double price;
	
	
	/**
	 * constructor
	 * @param name
	 * @param serialNum
	 * @param price
	 */
	public Product(String name, int serialNum, double price){
		this.name = name;
		this.serialNum = serialNum;
		this.price = price;
	}

	/**
	 * constructor
	 * @param product
	 */
	public Product(Product product) {
	    this(product.name, product.serialNum, product.price);
    }
	
	/**
	 * @return
	 */
	public double getProductPrice() {
		return this.price;
	}

	/**
	 * @return 
	 */
	public abstract double[] computeFinalPrice();
	
}
