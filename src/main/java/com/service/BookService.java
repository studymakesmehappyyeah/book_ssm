package com.service;

import com.pojo.Books;

import java.util.List;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/25 13:13
 */
public interface BookService {
    public List<Books> findAllBook();


    public Integer insertBook(Books books);

    public Books queryBook(String name);

    public Books queryBookById(Integer id);

    public int updateBook(Books books);

    public int delBookById(int id);
}
