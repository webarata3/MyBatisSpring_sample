package com.example.mybatis;

import com.example.mybatis.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/META-INF/application-context.xml");
        BookService bookService = ctx.getBean(BookService.class);
        bookService.insertErrorTest();
    }
}
