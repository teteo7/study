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

    @Select("select * from board")
    public List<Board> getAllBoards();
}
