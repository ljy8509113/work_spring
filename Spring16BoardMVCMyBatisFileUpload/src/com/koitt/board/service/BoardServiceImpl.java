package com.koitt.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.koitt.board.dao.BoardDao;
import com.koitt.board.model.Board;
import com.koitt.board.model.BoardException;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDao dao;
	
	public BoardServiceImpl() {}
	
	@Override
	public void add(Board board) throws BoardException {
		dao.insert(board);
	}

	@Override
	public Board detail(String no) throws BoardException {
		return dao.select(no);
	}

	@Override
	public List<Board> list() throws BoardException {
		return dao.selectAll();
	}

	@Override
	public int count() throws BoardException {
		return dao.boardCount();
	}

	@Override
	public String modify(Board board) throws BoardException {
		Board b = dao.select(board.getNo().toString());
		String filename = b.getAttachment();
		dao.update(board);
		
		return filename;
	}

	@Override
	public String remove(String no) throws BoardException {
		Board board = dao.select(no);
		String filename = board.getAttachment();
		dao.delete(no);
		
		return filename;
	}

}
