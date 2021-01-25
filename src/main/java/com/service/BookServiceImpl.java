package com.service;

import com.dao.BookMapper;
import com.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/25 13:12
 */
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;


    @Override
    public List<Books> findAllBook() {
        return bookMapper.findAllBook();
    }

    @Override
    public Integer insertBook(Books books) {
        return bookMapper.insertBook(books);
    }

    @Override
    public Books queryBook(String name) {
        return bookMapper.queryBook(name);
    }

    @Override
    public Books queryBookById(Integer id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public int delBookById(int id) {
        return this.bookMapper.delBookById(id);
    }


}
