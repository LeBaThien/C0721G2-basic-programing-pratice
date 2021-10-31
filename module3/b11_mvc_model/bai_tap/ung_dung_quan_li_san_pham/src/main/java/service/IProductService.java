package service;

import bean.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    ArrayList<Product> findAll();
    Product findById(Integer id);
    Product findByName(String name);
    void save (Product product);
    void update(Integer id, Product product);
    void delete(Integer id);


}
