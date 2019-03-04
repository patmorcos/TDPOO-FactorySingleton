package factory;

import abstrac.AbstractProduct;
import products.Product;

import java.util.HashMap;
import java.util.Map;

public final class ProductFactory {
    private static Map<String, Product> registry = new HashMap<String, Product>();
    private static volatile ProductFactory instance = null;

    public static void registerProduct(String name, Product p){
        registry.put(name,p);
    }

    public static ProductFactory getInstance() {
        ProductFactory result = instance;
        if (result == null) {
            synchronized (ProductFactory.class) {
                result = instance;
                if (result == null) {
                    instance = new ProductFactory();
                }
            }
        }
        return instance;
    }

    public AbstractProduct createProduct(String name){
        return (AbstractProduct) registry.get(name).createProduct();
    }
}

