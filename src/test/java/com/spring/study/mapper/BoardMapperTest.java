package com.spring.study.mapper;

import com.spring.study.dto.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;

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

    @Test
    @Transactional
    public void createBoard2() {
        //데이터 입력을 10번 한다.
        for(int i=1; i<=10; i++){
            Board board3 = Board.builder()
                    .title("제목" + i)
                    .content("내용" + i)
                    .writer("작성자" + i)
                    .date_created(new Timestamp(System.currentTimeMillis()))
                    .build();
            boardMapper.createBoard(board3);
            System.out.println(board3.toString());
        }
        List<Board> boards = boardMapper.listBoard();
        assertEquals(10,  boards.size());

    }

}