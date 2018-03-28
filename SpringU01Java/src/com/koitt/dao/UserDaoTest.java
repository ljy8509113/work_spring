package com.koitt.dao;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.koitt.vo.User;

public class UserDaoTest {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/com/koitt/config/applicationContext.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		User user = new User();
		user.setId("curling");
		user.setName("김영미");
		user.setPassword("1234");
		
		try {
			dao.add(user);
			System.out.println("user.getId()" + " suceess");
			
			User user2;
			user2 = dao.get(user.getId());
			
			System.out.println("user2 " + user2.getId());
			System.out.println("user2 " + user2.getName());
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
