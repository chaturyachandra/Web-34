package com.example.q1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.q1.model.chaturya_HO;
import com.example.q1.model.chaturya_ROO;
import com.example.q1.service.chaturya_AUTO;
import com.example.q1.service.chaturya_TYY;

@RestController
public class chaturya_AUTH {
    @Autowired
    private chaturya_AUTO authorService;
@Autowired
private chaturya_TYY bookService;
    @PostMapping("/author")
    public ResponseEntity<chaturya_HO> createAuthor(@RequestBody chaturya_HO author) {
        chaturya_HO savedAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(savedAuthor, HttpStatus.CREATED);
    }

    @PostMapping("/book/author/{authorId}")
    public ResponseEntity<chaturya_ROO> createBookForAuthor(@PathVariable Long authorId, @RequestBody chaturya_ROO book) {
        chaturya_ROO savedBook = bookService.saveBook(authorId, book);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<chaturya_HO> getAuthorById(@PathVariable Long authorId) {
        chaturya_HO author = authorService.getAuthorById(authorId);
        if (author != null) {
            return new ResponseEntity<>(author, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    public ResponseEntity<List<chaturya_HO>> getAllAuthors() {
        List<chaturya_HO> authors = authorService.getAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<chaturya_HO> updateAuthor(@PathVariable Long authorId, @RequestBody chaturya_HO author) {
        chaturya_HO updatedAuthor = authorService.updateAuthor(authorId, author);
        if (updatedAuthor != null) {
            return new ResponseEntity<>(updatedAuthor, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable Long bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>("Book deleted successfully", HttpStatus.OK);
    }
}
