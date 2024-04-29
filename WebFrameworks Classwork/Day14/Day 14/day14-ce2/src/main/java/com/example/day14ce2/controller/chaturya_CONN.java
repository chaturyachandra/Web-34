package com.example.day14ce2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce2.model.chaturya_P;
import com.example.day14ce2.service.chaturya_SER;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "Book Controller" ,description = "null")
public class chaturya_CONN {
    @Autowired
    chaturya_SER bookService;

    @PostMapping("/api/book")
    public chaturya_P addBook(@RequestBody chaturya_P book)
    {
        return bookService.addBook(book);
    }

    @PutMapping("/api/book/{id}")
    public chaturya_P updateBook(@PathVariable int id,@RequestBody chaturya_P book)
    {
        return bookService.updateBook(id,book);
    }

    @GetMapping("/api/book")
    public List<chaturya_P> getBooks()
    {
        return bookService.getBooks();
    }

    @GetMapping("/api/book/{id}")
    public Optional<chaturya_P> getBook(@PathVariable int id)
    {
        return bookService.getBook(id);
    }
}
