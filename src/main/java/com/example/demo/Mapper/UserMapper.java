package com.example.demo.Mapper;

import com.example.demo.Entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public User QueryUser(String name);
}
