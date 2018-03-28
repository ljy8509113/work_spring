package com.koitt.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User item = new User();
		
		item.setId(rs.getInt("id"));
		item.setPassword(rs.getString("password"));
		item.setUsername(rs.getString("username"));
		item.setAge(rs.getInt("age"));
		
		return item;
	}

}
