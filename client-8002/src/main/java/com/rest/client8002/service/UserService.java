package com.rest.client8002.service;


import com.rest.client8002.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Integer id);

    int saveUser(User user);
}
