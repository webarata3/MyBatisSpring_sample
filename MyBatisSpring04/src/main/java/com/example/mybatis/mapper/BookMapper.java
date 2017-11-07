package com.example.mybatis.mapper;

import com.example.mybatis.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Scanner;

public interface BookMapper {
    @Select("SELECT book_id, book_name, author, price FROM book WHERE book_id = #{bookId}")
    public Book select(Integer bookId);

    @Insert("INSERT INTO book VALUES(#{bookId}, #{bookName}, #{author}, #{price})")
    public int insert(Book book);
}
