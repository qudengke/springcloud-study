package com.rest.client8002.control;

import com.rest.client8002.model.User;
import com.rest.client8002.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUserById")
    public User getUser(@RequestParam("id") Integer id){
        Optional<User> userById = userService.getUserById(id);
        return userById.get();
    }

    @PostMapping("/saveUser")
    public int saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
}
