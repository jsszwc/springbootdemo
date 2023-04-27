package com.example.jsszwc.controller;

import com.example.jsszwc.entity.Author;
import com.example.jsszwc.entity.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello, SpringBoot";
    }

    @RequestMapping("/book")
    public void addBook(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author) {
        System.out.println(book);
        System.out.println(author);
    }

    @InitBinder("book")
    public void b(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("author")
    public void a(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }
}
