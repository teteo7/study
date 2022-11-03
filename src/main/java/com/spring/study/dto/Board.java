package com.spring.study.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;


@Builder
@Getter
@ToString
public class Board {
    private int id;
    private String title;
    private String content;
    private String writer;
    private Timestamp date_created;
}
