package com.spring.study.mapper;

import com.spring.study.dto.Board;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {
    @Insert("INSERT INTO board (title, content, writer, date_created) values (#{board.title}, #{board.content}, #{board.writer}, #{board.date_created})")
    public void createBoard(@Param("board") Board board);

//    1.1 이 함수는 왜 호줄이 안되는 거지
    @Insert("INSERT INTO board (title, content, writer, date_created) values (#{board.title}, #{board.content}, #{board.writer}, #{board.date_created})")
    public void createManyBoard(@Param("board") Board board);

    @Select("select * from board")
    public List<Board> getAllBoards();

    void createManyBoard();
}
