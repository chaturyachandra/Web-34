package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.chaturya_HO;
import com.example.q1.repository.chaturya_TO;

@Service
public class chaturya_AUTO {
    @Autowired
    private chaturya_TO authorRepository;

    public chaturya_HO saveAuthor(chaturya_HO author) {
        return authorRepository.save(author);
    }

    public chaturya_HO getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<chaturya_HO> getAllAuthors() {
        return authorRepository.findAll();
    }

    public chaturya_HO updateAuthor(Long id, chaturya_HO author) {
        chaturya_HO existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
