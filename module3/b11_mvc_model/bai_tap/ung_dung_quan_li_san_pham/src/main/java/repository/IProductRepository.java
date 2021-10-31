package repository;

import bean.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductRepository {
    ArrayList<Product> findAll();
    Product findById(Integer id);
    Product findByName(String name);
    void save (Product product);
    void update (Integer id, Product product);
    void delete (Integer id);
}
