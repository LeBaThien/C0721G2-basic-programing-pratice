package application.service;

import application.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService {
    private static final Map<Integer,Product> products;
    static {

        products = new HashMap<>();
        products.put(1, new Product(1,"Iphone 11",2523,"Full box","Apple"));
        products.put(2, new Product(2,"Sonny A3",1252,"New 100%","Sonny"));
        products.put(3, new Product(3,"Samsung note 20",4223,"full box","Samsung"));
        products.put(4, new Product(4,"Lg G5",43523,"Full box 99%","LG"));
        products.put(5, new Product(5,"Xiaomi redmi note 10",3223,"New 98%","Xiaomi"));
        products.put(6, new Product(6,"Iphone 13 pro max",5523,"Full box ","Apple"));
        products.put(7, new Product(7,"huawei mate",4223,"New 99%","huawei"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getProductId(),product);
    }

    @Override
    public void update(int productId, Product product) {
        products.put(productId, product);
    }

    @Override
    public void remove(int productId) {
        products.remove(productId);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
