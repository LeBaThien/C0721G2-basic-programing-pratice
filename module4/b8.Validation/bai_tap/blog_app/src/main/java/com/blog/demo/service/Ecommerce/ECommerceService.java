package com.blog.demo.service.Ecommerce;

//
import com.blog.demo.model.Blog;
import com.blog.demo.model.ECommerce;
import com.blog.demo.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ECommerceService extends IGeneralService<ECommerce> {
    List<ECommerce> findAll();
    Page<ECommerce> findById(int id);
    Page<ECommerce> findAllEcommerce();

}
