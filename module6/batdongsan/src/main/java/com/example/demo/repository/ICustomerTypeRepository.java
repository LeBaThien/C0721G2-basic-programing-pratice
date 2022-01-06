package com.example.demo.repository;


import com.example.demo.model.CustomerType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerTypeRepository extends PagingAndSortingRepository<CustomerType, Long> {
}
