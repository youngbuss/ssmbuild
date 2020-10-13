package com.yang.service;

import com.yang.pojo.Books;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface BookService {
    //add
    int addBook(Books books);
    //delete
    int deleteBookById(int id);
    //update
    int updateBook(Books books);
    //query
    Books queryBookById( int id);
    //queryall
    List<Books> queryAllBook();

    List<Books> queryBookByName(String bookName);
}
