package com.rest.eurekaclient8003.service;

import com.rest.eurekaclient8003.model.User;
import com.rest.eurekaclient8003.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public int saveUser(User user) {
        userRepository.saveAndFlush(user);
        return user.getId();
    }
}
