package com.konstantin.mvc.Service;


import com.konstantin.mvc.entity.Author;
import com.konstantin.mvc.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;


    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthorById(int id) {
        Author author = null;
        Optional<Author> a = authorRepository.findById(id);
        if (a.isPresent()) {
            author = a.get();
        }
        return author;
    }

    @Override
    public void saveAuthor(Author authors) {
        authorRepository.save(authors);
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.deleteById(id);
    }
}
