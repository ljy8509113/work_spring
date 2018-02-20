package com.koitt.java.tx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BoardDao {
	
	public Integer getBoardNo(Connection conn) {
		
		Integer no = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 최근 글 번호 가져오기
			String sql = "SELECT no FROM board02 ORDER BY no DESC LIMIT 1";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				no = rs.getInt("no") + 1;
			}
			else {
				no = 1;
			}
			
			// 가져온 글 번호를 테이블에 저장
			sql = "INSERT INTO board02 (no, title, content, writer, regdate) ";
			sql += "VALUES (?, NULL, NULL, NULL, CURDATE())";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				DBUtil.getInstance().close(rs);
				DBUtil.getInstance().close(pstmt);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return no;
	}
	
	public void insert(Connection conn, Board board) {
		PreparedStatement pstmt = null;
		String sql = "UPDATE board02 SET title = ?, content = ?, writer = ? WHERE no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			pstmt.setInt(4, board.getNo());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				DBUtil.getInstance().close(pstmt);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
