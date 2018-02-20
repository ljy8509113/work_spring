package com.koitt.test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.koitt.model.Emp;

public class TestDrive {
	public static void main(String[] args) {
		String resource = "com/koitt/config/mybatis.xml";
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builder.build(reader, "development");
			SqlSession session = factory.openSession();
			
			Emp e = session.selectOne("com.koitt.model.Emp.select", 7698);
			Emp e2 = session.selectOne("com.koitt.model.Emp.select2", 7698);
			
			System.out.println(e);
			System.out.println(e2);
			
			session.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
