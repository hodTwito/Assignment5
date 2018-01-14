public class ProductInStorageSmall extends Product {

    public ProductInStorageSmall(String name, int serialNum, double price) {
        super(name, serialNum, price);
    }

    public ProductInStorageSmall(ProductInStorageSmall productInStorageSmall) {
        super(productInStorageSmall);
    }

    @Override
    public double[] computeFinalPrice() {
        return new double[0];
    }
}
