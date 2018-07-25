package com.rest.client8001.service;



import com.rest.client8001.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Integer id);

    int saveUser(User user);
}
