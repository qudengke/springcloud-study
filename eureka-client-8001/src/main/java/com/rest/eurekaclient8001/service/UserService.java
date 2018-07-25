package com.rest.eurekaclient8001.service;



import com.rest.eurekaclient8001.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Integer id);

    int saveUser(User user);
}
