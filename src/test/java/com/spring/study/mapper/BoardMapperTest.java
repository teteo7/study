package com.spring.study.mapper;

import com.spring.study.dto.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BoardMapperTest {

    @Autowired
    private BoardMapper boardMapper;

    @Test
    public void createBoard(){
        Board board = Board.builder()
                .title("제목은 제목")
                .content("내용은 내용")
                .writer("작성자는 작성자")
                .date_created(new Timestamp(System.currentTimeMillis()))
                .build();

        Board board2 = Board.builder()
                .title("제목은 제목2")
                .content("내용은 내용2")
                .writer("작성자는 작성자2")
                .date_created(new Timestamp(System.currentTimeMillis()))
                .build();
            boardMapper.createBoard(board);
            boardMapper.createBoard(board2);

            System.out.println(board.toString());
            System.out.println(board2.toString());
    }


}