package com.blog.demo.repository;


import com.blog.demo.model.ECommerce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ECommerceRepository  extends JpaRepository<ECommerce,Integer> {

//    List<ECommerce> findAll();
//    Chổ này chưa đúng,,, vì jpa chưa bk có hỗ trợ find all ko??
//    Kế thừa JPa hoặc sử dụng Pagingandsorting,,,,

}
