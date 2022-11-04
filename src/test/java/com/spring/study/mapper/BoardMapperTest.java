package com.spring.study.mapper;

import com.spring.study.dto.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

//    1.2 이거 왜 안되지 BoardMapper에 @Insert어노테이션에 함수 호출
    @Test
    public void testJpa() {
        for (int i=1; i<= 15; i++){
            Board board3= Board.builder()
                    .title("대단한 제목")
                    .content("멋진 내용: [%03d]\", i")
                    .writer("푸름이")
                    .date_created(new Timestamp(System.currentTimeMillis()))
                    .build();

            this.boardMapper.createManyBoard(board3);

            System.out.println(board3.toString());
        }
    }



}