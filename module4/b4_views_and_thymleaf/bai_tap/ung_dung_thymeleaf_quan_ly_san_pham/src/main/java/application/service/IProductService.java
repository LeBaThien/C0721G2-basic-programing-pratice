package application.service;

import application.model.Product;

import java.util.List;

public interface IProductService {
//    Hiển thị danh sách sản phẩm
//    Tạo sản phẩm mới
//    Cập nhật thông tin sản phẩm
//    Xoá một sản phẩm
//    Xem chi tiết một sản phẩm
//    Tìm kiếm sản phẩm theo tên
    List<Product> findAll();
    void save(Product product);
    void update(int productId, Product product );
    void remove(int productId);
    Product findById(int id);

}
