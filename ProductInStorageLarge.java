public class ProductInStorageLarge extends Product {

    public ProductInStorageLarge(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    public ProductInStorageLarge(ProductInStorageLarge productInStorageLarge) {
        super(productInStorageLarge);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[0];
    }
}
