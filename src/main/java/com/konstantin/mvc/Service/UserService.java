package com.konstantin.mvc.Service;


import com.konstantin.mvc.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);

    void updateUser(int id, User updatedUser);

    void saveUser (User user);

    void deleteUser (int id);
}
