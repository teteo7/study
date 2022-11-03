package com.spring.study;

import com.spring.study.dto.Board;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootTest
class StudyApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	public void createBoard(){
		Board board = Board.builder()
				.title("제목은 제목")
						.build();
		System.out.println(board.toString());


	}

}
