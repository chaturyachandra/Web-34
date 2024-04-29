package com.example.day14ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.model.chaturya_P;
import com.example.day14ce2.repository.chaturya_REPO;

@Service
public class chaturya_SER {
   @Autowired
   chaturya_REPO bookRepo;

   public chaturya_P addBook(chaturya_P book)
   {
        return bookRepo.save(book);
   }

   public List<chaturya_P> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<chaturya_P> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public chaturya_P updateBook(int id,chaturya_P book)
   {
        chaturya_P avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
