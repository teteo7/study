package com.spring.study.service;

import com.spring.study.dto.User;
import com.spring.study.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> list() {
        return userMapper.listUser();
    }

}
