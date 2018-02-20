package com.koitt.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koitt.model.Emp;

@Repository
public class EmpDao2 {
	@Autowired
	private SqlSession session;
	
	public Emp getEmp(int empno) {
		Emp emp = session.selectOne("com.koitt.model.Emp.select", empno);
//		session.close();
		return emp;
	}
	
}
