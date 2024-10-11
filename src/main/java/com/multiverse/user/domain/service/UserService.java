package com.multiverse.user.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiverse.user.adapters.in.UserPort;
import com.multiverse.user.adapters.out.UserRepository;
import com.multiverse.user.domain.model.User;

@Service
public class UserService implements UserPort{

    @Autowired
    private UserRepository userRepository;


    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User createUser(String username, String password) {
        return userRepository.save(new User(username, password));
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(Long id, User updatedUser) {
        return userRepository.save(updatedUser);
    }
}

