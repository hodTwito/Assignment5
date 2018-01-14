public class ProductInStorageMedium extends Product {

    public ProductInStorageMedium(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    public ProductInStorageMedium(ProductInStorageMedium productInStorageMedium) {
        super(productInStorageMedium);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[0];
    }
}
