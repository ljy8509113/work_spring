package com.koitt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.koitt.dao.BoardDao;
import com.koitt.model.Board;

public class TestDrive {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/com/koitt/config/config.xml");
		BoardDao dao = context.getBean(BoardDao.class);
		Board board = dao.getEmployee(2);
		
		System.out.println(board);
		
		BoardDao dao2 = context.getBean(BoardDao.class);
		Board board2 = dao2.getEmployee(1);
		
		System.out.println(board2);
		
	}
}
