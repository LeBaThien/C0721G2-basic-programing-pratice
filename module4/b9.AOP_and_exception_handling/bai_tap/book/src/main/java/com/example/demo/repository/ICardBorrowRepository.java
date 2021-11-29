package com.example.demo.repository;

import com.example.demo.model.CardBorrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardBorrowRepository extends JpaRepository<CardBorrow, Integer > {
}
