package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DotDotDot {
	
	public void print(Object...args) {
		for(Object j : args)
			System.out.print(j + " ");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/config/config.xml");
		JdbcTemplate template =  context.getBean(JdbcTemplate.class);
		
		DotDotDot dot = new DotDotDot();
		dot.print("A");
		dot.print("1","2");
		dot.print(1,2,3,4,5);
		
		
		
	}
}
