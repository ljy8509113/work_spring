package com.koitt.model;

import java.util.Date;

public class Board {
	private Integer no;
	private String title;
	private String content;
	private Integer user_no;
	private Date regdate;
	
	public Board() {
	}

	public Board(Integer no, String title, String content, Integer user_no, Date regdate) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.user_no = user_no;
		this.regdate = regdate;
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

	public Integer getUser_no() {
		return user_no;
	}

	public void setUser_no(Integer user_no) {
		this.user_no = user_no;
	}

	public Date getRegDate() {
		return regdate;
	}

	public void setRegDate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		result = prime * result + ((regdate == null) ? 0 : regdate.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((user_no == null) ? 0 : user_no.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Board other = (Board) obj;
		if(other.no == this.no)
			return true;
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Board [no=");
		builder.append(no);
		builder.append(", title=");
		builder.append(title);
		builder.append(", content=");
		builder.append(content);
		builder.append(", user_no=");
		builder.append(user_no);
		builder.append(", regDate=");
		builder.append(regdate);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
