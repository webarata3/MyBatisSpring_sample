package com.example.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory;
        try (InputStream is = Main.class.getResourceAsStream("/META-INF/mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }

        try (SqlSession session = sqlSessionFactory.openSession()) {
            Book book = new Book(333, "よくわかるMyBatis", "加藤二郎", 4980);
            int count = session.insert("com.example.mybatis.mapper.BookMapper.insert", book);
            System.out.println("更新件数は" + count + "件");
            List<Book> bookList = session.selectList("com.example.mybatis.mapper.BookMapper.selectAll");
            bookList.forEach(System.out::println);
            session.commit();
        }
    }
}
