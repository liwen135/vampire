package com.ocean.vampire.service;

import com.ocean.vampire.domain.Book;

public interface BookService {

   Book queryById(Integer id);

   int insertBook(Book book);

}
