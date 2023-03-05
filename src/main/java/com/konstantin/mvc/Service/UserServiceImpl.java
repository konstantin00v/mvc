package com.konstantin.mvc.Service;

import com.konstantin.mvc.entity.User;
import com.konstantin.mvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        Optional<User> usa = userRepository.findById(id);
        User user = usa.isPresent() ? usa.get() : null;
        return user;
    }

    @Override
    public void updateUser(int id, User updatedUser) {
        User userToBeUpdated = getUserById(id);

        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setEmail(updatedUser.getEmail());
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser (int id) {userRepository.deleteById(id);}



}
