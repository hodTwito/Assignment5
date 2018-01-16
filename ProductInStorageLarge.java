public class ProductInStorageLarge extends Product {

	/**
	 * default constructor.
	 * @param name name of the Product.
	 * @param serialNum serial number of the product.
	 * @param price price of the product.
	 */
	public ProductInStorageLarge(String name, int serialNum, double price) {
		super(name, serialNum, price);
	}

	/**
	 * copy constructor.
	 * @param object object to be copied.
	 */
	public ProductInStorageLarge(Object object) {
		super((ProductInStorageLarge)object);
	}

	@Override
	public double[] computeFinalPrice() {
		return new double[] {this.getProductPrice(), Math.floor(0.1 * getProductPrice())};
	}
}
