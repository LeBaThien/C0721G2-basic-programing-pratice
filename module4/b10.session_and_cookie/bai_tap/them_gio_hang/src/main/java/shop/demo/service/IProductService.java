package shop.demo.service;



import org.springframework.stereotype.Service;
import shop.demo.model.Product;

import java.util.Optional;

@Service
public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
