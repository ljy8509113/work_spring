package com.koitt.java.tx;

public class TestDrive {
	public static void main(String[] args) {
		BoardService service = new BoardService();
		Board board = new Board(null, "title-1", "content-1", "writer-1", null);
		service.add(board);
	}
}
