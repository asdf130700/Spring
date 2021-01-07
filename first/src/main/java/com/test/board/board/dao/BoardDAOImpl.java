package com.test.board.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.board.board.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{

	@Inject
	private SqlSession sqlSession;
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("com.test.board.mapper.BoardMapper.insert", boardVO);
		
	}
	@Override
	public List<BoardVO> list() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.test.board.mapper.BoardMapper.list");
	}
	@Override
	public BoardVO view(int no) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("com.test.board.mapper.BoardMapper.view", no);
	}
	@Override
	public void update(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("com.test.board.mapper.BoardMapper.update", boardVO);
		
	}
	@Override
	public void delete(int no) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete("com.test.board.mapper.BoardMapper.delete", no);
	}

}
