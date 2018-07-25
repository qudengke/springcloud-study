package com.rest.eurekaclient8002.repository;

import com.rest.eurekaclient8002.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
