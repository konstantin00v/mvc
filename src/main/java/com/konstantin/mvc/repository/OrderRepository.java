package com.konstantin.mvc.repository;

import com.konstantin.mvc.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
