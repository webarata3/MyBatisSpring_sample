package com.example.mybatis.mapper;

import com.example.mybatis.Book;

import java.util.List;

public interface BookMapper {
    public List<Book> selectAll();
}
