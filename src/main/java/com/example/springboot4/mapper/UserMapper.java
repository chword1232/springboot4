package com.example.springboot4.mapper;

import com.example.springboot4.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUserById(Integer id);
}
