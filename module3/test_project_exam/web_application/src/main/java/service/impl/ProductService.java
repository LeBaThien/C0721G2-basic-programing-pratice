package service.impl;

import bean.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

public class ProductService implements IProductService {
    IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> showList() {
        return iProductRepository.showList();
    }

    @Override
    public void insert(Product product) {
        iProductRepository.insert(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public boolean update(Product product)  {
        return iProductRepository.update(product);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }

    @Override
    public List<Product> findProduct(String productName) {
        return iProductRepository.findProduct(productName);
    }
}
