package com.example.mybatis.mapper;

import com.example.mybatis.Book;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    public Book select(Integer bookId);
}
