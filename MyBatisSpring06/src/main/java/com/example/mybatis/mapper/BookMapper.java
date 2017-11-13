package com.example.mybatis.mapper;

import com.example.mybatis.Book;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface BookMapper {
    public List<Book> selectAll();

    @Insert("INSERT INTO book(book_id, book_name, author, price) VALUES(#{bookId}, #{bookName}, #{author}, #{price})")
    public int insert(Book book);
}
