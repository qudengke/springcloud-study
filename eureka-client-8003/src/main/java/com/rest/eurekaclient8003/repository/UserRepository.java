package com.rest.eurekaclient8003.repository;

import com.rest.eurekaclient8003.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
