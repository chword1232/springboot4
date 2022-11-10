package com.example.springboot4.service;

import com.example.springboot4.bean.User;
import com.example.springboot4.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getUserById(Integer id){

        return userMapper.getUserById(id);
    }

}
