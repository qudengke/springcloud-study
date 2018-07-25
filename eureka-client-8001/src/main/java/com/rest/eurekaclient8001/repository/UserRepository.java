package com.rest.eurekaclient8001.repository;

import com.rest.eurekaclient8001.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
