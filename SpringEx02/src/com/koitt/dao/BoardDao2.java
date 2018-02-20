package com.koitt.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.model.Board;

@Repository
public class BoardDao2 {
	@Autowired
	private SqlSession session;
	
	public Board getEmp(int empno) {
		Board emp = session.selectOne("com.koitt.model.Board.select", empno);
//		session.close();
		return emp;
	}
	
}
