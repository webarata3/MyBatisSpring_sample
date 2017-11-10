package com.example.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory;
        try (InputStream is = Main.class.getResourceAsStream("/META-INF/mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }

        try (SqlSession session = sqlSessionFactory.openSession()) {
            Book book = new Book();
//            List<String> authorList = Collections.emptyList();
            List<String> authorList = Arrays.asList("山田太郎");
            book.setAuthorList(authorList);
            List<Book> bookList = session.selectList("com.example.mybatis.mapper.BookMapper.selectAuthor", book);
            bookList.forEach(System.out::println);
        }
    }
}
