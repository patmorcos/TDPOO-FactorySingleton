package products;

import factory.ProductFactory;
import abstrac.AbstractProduct;
//import products.Product;

public final class ProductC extends AbstractProduct {

    static{
        ProductFactory.registerProduct("ProductC",new ProductC());
    }

    public AbstractProduct createProduct() {
        return new ProductC();
    }

    public void perform() {
        System.out.println("I’m a ProductC , performing ");
    }

    public void foo() {
        this.perform();
    }
}
