public class ProductInStore extends Product {

    /**
     * default constructor.
     * @param name name of the Product.
     * @param serialNum serial number of the product.
     * @param price price of the product.
     */
    public ProductInStore(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    /**
     * copy constructor.
     * @param object object to be copied.
     */
    public ProductInStore(Object object) {
        super((ProductInStore)object);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[] {this.getProductPrice(), 0};
    }
}
