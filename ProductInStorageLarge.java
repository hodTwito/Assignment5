public class ProductInStorageLarge extends Product {

    public ProductInStorageLarge(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    public ProductInStorageLarge(ProductInStorageLarge productInStorageLarge) {
        super(productInStorageLarge);
    }

    public ProductInStorageLarge(Object object) {
        super((ProductInStorageLarge)object);
     }

    @Override
    public double[] computeFinalPrice() {
        return new double[] {this.getProductPrice(), Math.floor(0.1 * getProductPrice())};
    }
}
