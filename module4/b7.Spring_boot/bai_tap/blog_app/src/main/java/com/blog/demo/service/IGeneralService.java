package com.blog.demo.service;

import com.blog.demo.model.Blog;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    void save(T t);

    void remove(Long id);

    void update(int id);

//    void save(int id, Blog blog);
}
