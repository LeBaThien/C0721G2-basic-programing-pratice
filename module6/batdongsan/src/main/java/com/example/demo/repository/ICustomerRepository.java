package com.example.demo.repository;

import com.example.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Optional<Customer> findCustomerByCustomerPhone(String phone);


    @Query(value = "update customers set deleted = true where id:customerId", nativeQuery = true)
    Optional<Customer> updateCustomerById(long customerId);
}
