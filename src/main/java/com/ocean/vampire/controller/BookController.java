package com.ocean.vampire.controller;

import com.ocean.vampire.domain.Book;
import com.ocean.vampire.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/book")
public class BookController {
    @Resource
    private BookService bookService;

    @ResponseBody
    @RequestMapping("/index")
    public Object index(Integer id) {
        Book book = bookService.queryById(id);
//        Map map = new HashMap();
//        map.put("username", "张三");
        return book;
    }

    @RequestMapping("/insert")
    public Object insert(Book book) {
        int count = bookService.insertBook(book);
        return count;
    }
}
