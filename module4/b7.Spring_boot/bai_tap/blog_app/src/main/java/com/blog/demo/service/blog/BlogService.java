package com.blog.demo.service.blog;

import com.blog.demo.model.Blog;
import com.blog.demo.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BlogService extends IGeneralService<Blog> {
    List<Blog>findAll();
    Blog findBlogById(int id);
    Page<Blog> findAllBlog(Pageable pageable);
    Page<Blog> findAllBlogByName(String name, Pageable pageable);
    Page<Blog> findAllBlogECommerceId(int id, Pageable pageable);
    void save (Blog blog);

//    void save(int id, Blog blog);
}
