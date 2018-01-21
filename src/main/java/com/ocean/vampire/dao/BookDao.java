package com.ocean.vampire.dao;

import com.ocean.vampire.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


public interface BookDao {

    @Select("select * from books where id = #{id}")
    Book queryById(Integer id);

    @Insert("insert into books (title,author) values (#{title},#{author})")
    int insertBook(Book book);

}
