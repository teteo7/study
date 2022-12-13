package com.spring.study.mapper;

import com.spring.study.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> getUsers();
    public void createUser(User user);
    public User findUser(User query);

}
