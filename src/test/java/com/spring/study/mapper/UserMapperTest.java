package com.spring.study.mapper;

import com.spring.study.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    @Transactional
    public void createUser() {
        User user1 = User.builder()
                .email("ljuho@naver.com")
                .password("1234")
                .name("이준호")
                .age(33)
                .gender("남자").build();

        userMapper.createUser(user1);

        List<User> users = userMapper.getUsers();
        assertEquals(1, users.size());

        User storedValue = users.get(0);
        assertEquals(user1.getEmail(), storedValue.getEmail());
    }
}