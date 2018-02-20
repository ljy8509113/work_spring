package com.koitt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.koitt.dao.EmpDao;
import com.koitt.model.Emp;

public class TestDrive {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/com/koitt/config/config.xml");
		EmpDao dao = context.getBean(EmpDao.class);
		Emp emp = dao.getEmployee(7698);
		
		System.out.println(emp);
		
		EmpDao dao2 = context.getBean(EmpDao.class);
		Emp emp2 = dao2.getEmployee(7698);
		
		System.out.println(emp2);
	}
}
