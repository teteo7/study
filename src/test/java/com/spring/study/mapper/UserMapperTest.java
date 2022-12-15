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
        // Transactional 어노테이션을 붙이면 테스트 코드가 종료되는 시점에 DB에 입력되었던 데이터가 롤백된다.

        // 새로운 유저를 생성하여 DB에 데이터를 insert한다.
        User user1 = User.builder()
                .email("ljuho@naver.com")
                .password("1234")
                .name("이준호")
                .age(33)
                .gender("남자").build();

        userMapper.createUser(user1);

        // 이메일 정보가 일치하는 데이터를 DB에서 조회한다.
        User query = User.builder().email("ljuho@naver.com").build();
        User storedValue = userMapper.findUser(query);

        // DB에서 가져온 데이터와 내가 insert한 데이터가 서로 일치하는지 확인한다.
        assertNotNull(storedValue);
        assertEquals(user1.getName(), storedValue.getName());
        assertEquals(user1.getAge(), storedValue.getAge());
        assertEquals(user1.getGender(), storedValue.getGender());
    }

    @Test
    @Transactional
    public void createUser2() {
        for(int i=1; i<=10; i++){
            User user = User.builder()
                    .email("이메일" + i)
                    .password("1234" + i)
                    .name("이름" + i)
                    .age(20 + i)
                    .gender("기본값default" + i)
                    .build();
            userMapper.createUser(user);
            System.out.println(user);
        }
        List<User> Users = userMapper.listUser();
        assertEquals(10, Users.size());
    }
}