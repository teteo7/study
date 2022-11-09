package com.spring.study.dao;

import com.spring.study.dto.Board;

import java.util.List;

public interface BoardDAO {
    
    
//    throws Exception이 들어가는 이유가 뭐지
    public List<Board> list() throws Exception;

}
