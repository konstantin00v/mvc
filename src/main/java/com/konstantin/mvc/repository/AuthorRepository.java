package com.konstantin.mvc.repository;

import com.konstantin.mvc.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
