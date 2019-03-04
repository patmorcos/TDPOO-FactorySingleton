package products;

import factory.ProductFactory;
import abstrac.AbstractProduct;
//import products.Product;

public final class ProductA extends AbstractProduct {

    static{
        ProductFactory.registerProduct("ProductA",new ProductA());
    }

    public AbstractProduct createProduct() {
        return new ProductA();
    }

    public void doYourStuff(){
        System.out.println("I’m a ProductA , doing my stuff ");
    }

    public void foo(){
        this.doYourStuff();
    }
}