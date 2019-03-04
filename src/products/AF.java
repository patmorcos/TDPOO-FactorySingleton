package products;

import factory.ProductFactory;

public class AF {
    static {
        try{
            Class.forName("products.ProductA");
            Class.forName("products.ProductB");
            Class.forName("products.ProductC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        Client myClient = new Client();

        ProductFactory instance = ProductFactory.getInstance();
        myClient.foo();
        Product PA = instance.createProduct("ProductA");
        Product PB = instance.createProduct("ProductB");
        Product PC = instance.createProduct("ProductC");
        PA.foo();
        PB.foo();
        PC.foo();

    }
}