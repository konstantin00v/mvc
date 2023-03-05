package com.konstantin.mvc.repository;

import com.konstantin.mvc.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
