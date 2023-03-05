package com.konstantin.mvc.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class BookStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_stock_id")
    private int book_stock_id;

    @Override
    public String toString() {
        return "BookStock{" +
                "book_stock_id=" + book_stock_id +
                ", book=" + book +
                '}';
    }

    @Column(name = "book")
    private String book;

    @Version
    int version;

    @Column(name = "price")
    private Integer price;

    @Column(name = "count")
    private int count;

    public BookStock(String book, Integer price) {
        this.book = book;
        this.price = price;
    }

    public BookStock(String book) {
        this.book = book;
    }

    public BookStock() {
    }


}