public class ProductInStore extends Product {

    public ProductInStore(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    public ProductInStore(Object object) {
        super((ProductInStore)object);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[] {this.getProductPrice(), 0};
    }
}
