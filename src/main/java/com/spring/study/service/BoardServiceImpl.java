package com.spring.study.service;

import com.spring.study.dao.BoardDAO;
import com.spring.study.dto.Board;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Inject
    private BoardDAO dao;

    @Override
    public List<Board> list() throws Exception{

        return dao.list();
    }


}
