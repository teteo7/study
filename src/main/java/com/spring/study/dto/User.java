package com.spring.study.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    private int id;
    private String email;
    private String password;
    private String name;
    private int age;
    private String gender;
}
