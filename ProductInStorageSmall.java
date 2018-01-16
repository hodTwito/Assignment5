public class ProductInStorageSmall extends Product {

    /**
     * default constructor.
     * @param name name of the Product.
     * @param serialNum serial number of the product.
     * @param price price of the product.
     */
    public ProductInStorageSmall(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    /**
     * copy constructor.
     * @param object object to be copied.
     */
    public ProductInStorageSmall(Object object) {
        super((ProductInStorageSmall)object);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[] {this.getProductPrice(), Math.floor(0.05 * getProductPrice())};
    }
}
