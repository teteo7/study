package com.spring.study.mapper;

import com.spring.study.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<Board> listBoard();
    public void createBoard(Board board);

}
