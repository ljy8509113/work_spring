package com.koitt.model;

import java.util.Date;

public class Board {
	Integer no;
	String title;
	String content;
	Integer userNo;
	Date regdate;
	String attachment;
	
	public Board() {		
	}
	
	public Board(Integer no, String title, String content, Integer userNo, Date regdate, String attachment) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.userNo = userNo;
		this.regdate = regdate;
		this.attachment = attachment;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getUserNo() {
		return userNo;
	}
	public void setUserNo(Integer userNo) {
		this.userNo = userNo;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	
}
