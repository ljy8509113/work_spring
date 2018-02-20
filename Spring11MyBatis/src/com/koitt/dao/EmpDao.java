package com.koitt.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.model.Emp;

@Repository
public class EmpDao {
	
	@Autowired
	private SqlSessionFactory factory;
	
	public Emp getEmployee(int empno) {
		SqlSession session = factory.openSession();
		Emp emp = session.selectOne("com.koitt.model.Emp.select", empno);
		session.close();
		
		return emp;
	}
}
