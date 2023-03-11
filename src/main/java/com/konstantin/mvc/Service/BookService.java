package com.konstantin.mvc.Service;


import com.konstantin.mvc.entity.Book;

import java.util.List;

public interface BookService {


     Book getBookById(int id);

     List<Book> getAllBooks();

     void saveBook(Book book);

     void deleteBook(int id);

    Book getBook(int id);
}
