package com.controller;

import com.pojo.Books;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZWH
 * @Description
 * @date 2021/1/25 13:14
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String findAllBook(Model model){
        List<Books> list = bookService.findAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    @GetMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    @RequestMapping(value = "/addBook",method = RequestMethod.POST)
    public String addBook(Books books){
        int rows = bookService.insertBook(books);
        System.out.println("rows="+rows);
        if (rows>0){
            return "redirect:/book/allBook";
        }

        return "err";
    }

    @RequestMapping("/queryBook")
    public String queryBook(@RequestParam("queryBookName") String name, Model model){
        Books books = this.bookService.queryBook(name);
        List<Books> list;
        if (books!=null){
            list = new ArrayList<>();
            list.add(books);
        }else {
            System.out.println("没有找到");
            list=bookService.findAllBook();
            model.addAttribute("err","未找到书籍");

        }
        model.addAttribute("list",list);
        return "allBook";
    }

    @RequestMapping("toUpdateBook")
    public String toUpdateBook(Integer id,Model model){
        Books books = this.bookService.queryBookById(id);
        model.addAttribute("book",books);
        return "updateBook";
    }

    @RequestMapping("updateBook")
    public String updateBook(Books books,Model model){
        int row = this.bookService.updateBook(books);
        if (row>0){
            List<Books> list = bookService.findAllBook();
            model.addAttribute("list",list);
            return "allBook";
        }
        return "err";
    }

    @RequestMapping("del/{id}")
    public String delBook(@PathVariable int id){
        int row = this.bookService.delBookById(id);
        System.out.println("row="+row);
        return "redirect:/book/allBook";
    }
}
