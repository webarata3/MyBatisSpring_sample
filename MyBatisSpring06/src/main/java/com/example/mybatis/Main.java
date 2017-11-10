package com.example.mybatis;

import com.example.mybatis.mapper.BookMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/application-context.xml");
        BookMapper bookMapper = ctx.getBean(BookMapper.class);
        List<Book> booKList = bookMapper.selectAll();
        booKList.forEach(System.out::println);
    }
}
