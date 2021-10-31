package service.impl;

import bean.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public ArrayList<Product> findAll() {
        return this.iProductRepository.findAll() ;
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id);
    }

    @Override
    public Product findByName(String name) {
        return iProductRepository.findByName(name);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void update(Integer id, Product product) {
        iProductRepository.update(id, product);
    }

    @Override
    public void delete(Integer id) {
        iProductRepository.delete(id);
    }
}
