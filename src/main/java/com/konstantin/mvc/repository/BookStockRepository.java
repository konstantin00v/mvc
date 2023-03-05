package com.konstantin.mvc.repository;

import com.konstantin.mvc.entity.BookStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookStockRepository extends JpaRepository<BookStock, Integer> {

    List<BookStock> findAllByBookAndPrice(String name, Integer price);
}
