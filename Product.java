public abstract class Product {

	private String name; //the name of the product.
	private int serialNum; // the serial number of the product.
	private double price; //the price of the product.
	
	
	/**
	 * default constructor
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
	 * copy constructor
	 * @param product
	 */
	public Product(Product product) {
	    this(product.name, product.serialNum, product.price);
    }

    /**
     * @return the name of the product
     */
    public String getProductName() {
	    return this.name;
    }

    /**
     * @return the serial number of the product.
     */
    public int getProductSerialNumber() {
	    return this.serialNum;
    }

	/**
	 * @return returns the price of the product (without shipping price).
	 */
	public double getProductPrice() {
		return this.price;
	}

	/**
	 * @return the final price of the product (includes shipping price).
	 */
	public abstract double[] computeFinalPrice();

    /**
     * @return a string describing the Product.
     */
	@Override
    public String toString() {
	    return "Product: " + this.name + ", " + this.serialNum + ", " + this.price;
    }

    /**
     * checks if the product other is equal to this product, if other is a Product.
     * @param other the product being compared with.
     * @return true if the products are the same and false otherwise.
     */
    @Override
    public boolean equals(Object other) {
	    if(other instanceof Product) {
            Product otherProduct = (Product)other;
            if(this.name.equals(otherProduct.name) &&
                    this.serialNum == otherProduct.serialNum &&
                    this.price == otherProduct.price) return true;
        }
        return false;
    }
	
}
