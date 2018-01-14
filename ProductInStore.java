public class ProductInStore extends Product {

    public ProductInStore(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    public ProductInStore(ProductInStore productInStore) {
        super(productInStore);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[0];
    }
}
