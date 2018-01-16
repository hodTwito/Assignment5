public class ProductInStorageMedium extends Product {

    /**
     * default constructor.
     * @param name name of the Product.
     * @param serialNum serial number of the product.
     * @param price price of the product.
     */
    public ProductInStorageMedium(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    /**
     * copy constructor.
     * @param object object to be copied.
     */
    public ProductInStorageMedium(Object object) {
        super((ProductInStorageMedium)object);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[] {this.getProductPrice(), Math.floor(0.07 * getProductPrice())};
    }
}
