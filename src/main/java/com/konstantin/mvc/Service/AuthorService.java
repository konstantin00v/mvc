package com.konstantin.mvc.Service;



import com.konstantin.mvc.entity.Author;

import java.util.List;

public interface AuthorService {


     List<Author> getAllAuthors();

     Author getAuthorById(int id);

     void saveAuthor(Author authors);

     void deleteAuthor(int id);

}
