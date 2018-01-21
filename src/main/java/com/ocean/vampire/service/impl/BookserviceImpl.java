package com.ocean.vampire.service.impl;

import com.ocean.vampire.dao.BookDao;
import com.ocean.vampire.domain.Book;
import com.ocean.vampire.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class BookserviceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public Book queryById(Integer id) {
        return bookDao.queryById(id);
    }

    @Override
    public int insertBook(Book book) {
        return bookDao.insertBook(book);
    }
}
