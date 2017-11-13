package com.example.mybatis.service;

import com.example.mybatis.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private SqlSession sqlSession;

    public void insertErrorTest() {
        Book book = new Book(20, "MyBatis", "田中一郎", 999);
        sqlSession.insert("com.example.mybatis.mapper.BookMapper.insert", book);
        sqlSession.insert("com.example.mybatis.mapper.BookMapper.insert", book);
    }
}
