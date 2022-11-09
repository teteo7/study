package com.spring.study.dao;

import com.spring.study.dto.Board;
import com.spring.study.mapper.BoardMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO{

//    @Autowired
//    private BoardDAO boarddao;

//    @Injection 오류 발생시 의존성 바꿔서 해보기
    @Inject
    private SqlSession sqlSession;

        @Override
        public List<Board> list() throws Exception {

            return sqlSession.selectList("BoardMapper.listboard");
        }

}
