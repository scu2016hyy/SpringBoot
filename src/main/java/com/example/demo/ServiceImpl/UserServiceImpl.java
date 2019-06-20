package com.example.demo.ServiceImpl;

import com.example.demo.Entity.User;
import com.example.demo.Mapper.UserMapper;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User QueryUser(String name) {
        return userMapper.QueryUser(name);
    }
}
