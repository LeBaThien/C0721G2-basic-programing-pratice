package repository.impl;

import bean.Product;
import repository.IProductRepository;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> showList() {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public boolean update(Product product) {
        return false;
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public List<Product> findProduct(String productName) {
        return null;
    }
}
