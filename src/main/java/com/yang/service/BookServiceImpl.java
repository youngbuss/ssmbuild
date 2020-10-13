package com.yang.service;

import com.yang.dao.BookMapper;
import com.yang.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{
    //service 调用 dao 组合dao
    private BookMapper bookMapper;

    @Override
    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
