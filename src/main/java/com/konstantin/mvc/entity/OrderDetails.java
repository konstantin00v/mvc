package com.konstantin.mvc.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_details_id")
    private int order_details_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "count_book")
    private int countBook;

    @Column(name = "price")
    private int price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;

    @Override
    public String toString() {
        return "OrderDetails{" +
                ", order=" + order +
                ", countBook=" + countBook +
                ", price=" + price +
                '}';
    }

    public OrderDetails() {
    }

    public OrderDetails(Order order, int countBook, int price, Book book) {
        this.order = order;
        this.countBook = countBook;
        this.price = price;
        this.book = book;
    }
}