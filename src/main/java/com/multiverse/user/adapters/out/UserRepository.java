package com.multiverse.user.adapters.out;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiverse.user.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    // implicito
    //User save(User user);

}
