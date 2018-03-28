package com.koitt.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class BoardFieldSetMapper implements FieldSetMapper<Board> {
	
	// 파일로부터 입력받는 데이터 형태를 컴퓨터가 알 수 있게 하기위한 필드
		private SimpleDateFormat dateFormat;
		
		public BoardFieldSetMapper() {
			dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		}
		
		@Override
		public Board mapFieldSet(FieldSet fieldSet) throws BindException {
			
			Board board = new Board();
			
			board.setNo(fieldSet.readInt(0));
			board.setTitle(fieldSet.readString(1));
			board.setContent(fieldSet.readString(2));
			board.setUserNo(fieldSet.readInt(3));
			//board.setRegdate(fieldSet.readDate(4));
			board.setAttachment(fieldSet.readString(5));
			
			// dd/MM/yyyy 형식을 Date 클래스 타입으로 변경하여 저장
			String date = fieldSet.readString(4);
			try {
				board.setRegdate(dateFormat.parse(date));
				
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			return board;
		}
}
