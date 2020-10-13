package com.yang.dao;

import com.yang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

public interface BookMapper {
    //add
    int addBook(Books books);
    //delete
    int deleteBookById(@Param("bookID") int id);
    //update
    int updateBook(Books books);
    //query
    Books queryBookById(@Param("bookID") int id);
    //queryall
    List<Books> queryAllBook();

    List<Books> queryBookByName(@Param("bookName") String bookName);
}
