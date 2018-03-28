package com.koitt.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDrive {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/koitt/config/config.xml");
		Example example = context.getBean(Example.class);
		example.execute();
		
		String ms = context.getMessage("greeting", null, "Hello", Locale.ENGLISH);
		System.out.println(ms);
	}
}
