package com.konstantin.mvc.repository;
import com.konstantin.mvc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAll();

    void deleteUserById(User entity);

    Optional<User> findById(Integer integer);


}
