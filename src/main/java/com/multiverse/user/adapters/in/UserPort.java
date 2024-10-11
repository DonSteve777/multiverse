package com.multiverse.user.adapters.in;

import com.multiverse.user.domain.model.User;

public interface UserPort {

    User createUser(String username, String password);
    User findUserById(Long id);
    User updateUser(Long id, User updatedUser);
    void deleteUser(Long id);
        
}
