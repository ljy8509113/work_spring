package com.koitt.java.tx;

import java.sql.Connection;

public class BoardService {
	BoardDao dao = new BoardDao();
	
	public void add(Board board) {
		Connection conn = null;
		
		try {
			conn = DBUtil.getInstance().getConnection();
			conn.setAutoCommit(false);
			Integer no = dao.getBoardNo(conn);
			board.setNo(no);
			dao.insert(conn, board);
			
//			conn.commit();
		}catch(Exception e) {
			e.printStackTrace();
			if(conn != null) {
				try {
					conn.rollback();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		}finally {
			if(conn != null) {
				try {
					conn.setAutoCommit(true);
					conn.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}				
		}
	}
}
