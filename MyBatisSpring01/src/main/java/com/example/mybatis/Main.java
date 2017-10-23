package com.example.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        SqlSessionFactory sqlSessionFactory;
        try (InputStream is = Main.class.getResourceAsStream("/META-INF/mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        }
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Book book = session.selectOne("com.example.mybatis.mapper.BookMapper.select", 101);
            System.out.println(book);
        }
    }
}
