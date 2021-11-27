package shop.demo.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import shop.demo.model.Product;

@Repository
public interface IProductRepository extends PagingAndSortingRepository<Product, Long> {
}
