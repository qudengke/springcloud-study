package com.rest.client8002.service;

import com.rest.client8002.model.User;
import com.rest.client8002.repository.UserRepository;
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
