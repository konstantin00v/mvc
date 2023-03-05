package com.konstantin.mvc.Service;

import com.konstantin.mvc.repository.BookRepository;
import com.konstantin.mvc.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private BookRepository bookRepository;

}
