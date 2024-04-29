package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.chaturya_HO;
import com.example.q1.model.chaturya_ROO;
import com.example.q1.repository.chaturya_TO;
import com.example.q1.repository.chaturya_IO;

@Service
public class chaturya_TYY {
    @Autowired
    private chaturya_IO bookRepository;
@Autowired
private chaturya_TO authorRepository;
    public chaturya_ROO saveBook(Long authorId, chaturya_ROO book) {
        chaturya_HO author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public chaturya_ROO getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

