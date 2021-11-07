package repository;

import bean.Product;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public interface IProductRepository {
    List<Product> showList();
    void insert(Product product);
    void delete(int id);
    boolean update(Product product);
    Product findById (int id);
    //    List<ProductType> showCustomerType();
    List<Product> findProduct(String productName);
}
