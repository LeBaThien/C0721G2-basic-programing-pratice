package com.example.demo.service;

import com.example.demo.model.CardBorrow;

import java.awt.print.Book;

public interface ICardService extends IGeneralService<CardBorrow>{
    public Boolean returnBook(Book book, int code);
}
