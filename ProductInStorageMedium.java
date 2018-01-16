public class ProductInStorageMedium extends Product {

    public ProductInStorageMedium(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    public ProductInStorageMedium(Object object) {
        super((ProductInStorageMedium)object);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[] {this.getProductPrice(), Math.floor(0.07 * getProductPrice())};
    }
}
