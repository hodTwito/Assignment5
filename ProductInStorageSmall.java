public class ProductInStorageSmall extends Product {

    public ProductInStorageSmall(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    public ProductInStorageSmall(Object object) {
        super((ProductInStorageSmall)object);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[] {this.getProductPrice(), Math.floor(0.05 * getProductPrice())};
    }
}
