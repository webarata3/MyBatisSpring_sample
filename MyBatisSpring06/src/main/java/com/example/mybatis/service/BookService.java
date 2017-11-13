package com.example.mybatis.service;

import com.example.mybatis.Book;
import com.example.mybatis.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public void insertError() {
        Book book = new Book(20, "MyBatis", "田中一郎", 999);
        bookMapper.insert(book);
        bookMapper.insert(book);
    }
}
