package com.board.dao;

import java.util.List;

import com.board.vo.BoardVO;
import com.board.vo.Criteria;

public interface BoardDAO {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	// 게시물 목록 조회
	public List<BoardVO> list(Criteria cri) throws Exception;
	public int listCount() throws Exception;
	public void update(BoardVO boardVO) throws Exception;
	public void delete(int bno) throws Exception;
	public BoardVO read(int bno) throws Exception;
}