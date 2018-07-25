package com.rest.eurekaclient8002.service;

import com.rest.eurekaclient8002.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Integer id);

    int saveUser(User user);
}
