package com.example.mybatis;

import java.util.Collections;
import java.util.List;

public class Book {
    private Integer bookId;
    private String bookName;
    private String author;
    private Integer price;

    private List<String> authorList;

    public Book() {
    }

    public Book(Integer bookId, String bookName, String author, Integer price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
            "bookId=" + bookId +
            ", bookName='" + bookName + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            '}';
    }

    public List<String> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<String> authorList) {
        this.authorList = authorList;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
