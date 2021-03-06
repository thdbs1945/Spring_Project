package com.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.vo.BoardVO;
import com.board.vo.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);
		
	}
	
	// 게시물 목록 조회
	@Override
	public List<BoardVO> list(Criteria cri) throws Exception {
		
		return sqlSession.selectList("boardMapper.listPage", cri);

	}
	
	public int listCount() throws Exception{
		return sqlSession.selectOne("boardMapper.listCount");
	}
	
	public void update(BoardVO boardVO) throws Exception{
		sqlSession.insert("boardMapper.update", boardVO);
	}
	
	public void delete(int bno) throws Exception{
		sqlSession.insert("boardMapper.delete", bno);
	}
	public BoardVO read(int bno) throws Exception{
		return sqlSession.selectOne("boardMapper.read",bno);
	}

}