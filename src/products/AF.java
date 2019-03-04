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
        ProductFactory PF = new ProductFactory();
        Product PFC = PF.createProduct("ProductC");
        myClient.foo();
        System.out.println(PFC.getClass().getCanonicalName());
    }
}