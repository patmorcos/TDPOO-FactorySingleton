package products;

import factory.ProductFactory;
import abstrac.AbstractProduct;
//import products.Product;

public final class ProductB extends AbstractProduct {

    static{
        ProductFactory.registerProduct("ProductB",new ProductB());
    }

    public AbstractProduct createProduct() {
        return new ProductB();
    }

    public void doIt(){
        System.out.println("I ’m a ProductB , doing it");
    }

    public void foo() {
        this.doIt();
    }
}