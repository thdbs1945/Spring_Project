package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}
	
	// 게시물 목록 조회
	public List<BoardVO> list() throws Exception{
		return dao.list();
	}
	@Override
	public void update(BoardVO boardVO) throws Exception{
		dao.update(boardVO);
	}
	@Override
	public void delete(int bno) throws Exception{
		dao.delete(bno);
	}
	public BoardVO read(int bno) throws Exception{
		return dao.read(bno);
	}
	

}