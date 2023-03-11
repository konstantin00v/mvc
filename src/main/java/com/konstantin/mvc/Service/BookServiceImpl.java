package com.konstantin.mvc.Service;

import com.konstantin.mvc.entity.Book;
import com.konstantin.mvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBookById(int id) {
        Book book = null;
        Optional<Book> b = bookRepository.findById(id);
        if (b.isPresent()) {
            book = b.get();
        }
        return book;
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);

    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }


    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);

    }

    @Override
    public Book getBook(int id) {
        Book book = null;
        Optional<Book> optional = bookRepository.findById(id);
        if (optional.isPresent()) {
            book = optional.get();
        }
        return book;
    }


}