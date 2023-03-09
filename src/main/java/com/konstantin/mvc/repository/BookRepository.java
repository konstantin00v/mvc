package com.konstantin.mvc.repository;

import com.konstantin.mvc.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
