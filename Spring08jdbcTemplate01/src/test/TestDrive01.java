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

public class TestDrive01 {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/config/config.xml");
		JdbcTemplate template =  context.getBean(JdbcTemplate.class);
		
		String sql = "select count(*) from emp";
		int count = template.queryForObject(sql, Integer.class);
		System.out.println("cout : " + count);
	
		DataSource dataSource = context.getBean(DataSource.class);
		
		try {
			Connection con = dataSource.getConnection();
			System.out.println(con.getClass().getName());
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("3. " + rs.getInt(1));
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		sql = "select count(*) from emp where deptno = ?";
		count = template.queryForObject(sql, Integer.class, 20);
		System.out.println("4: " + count);
		
		sql = "select ename from emp where empno = ?";
		String name = template.queryForObject(sql, String.class, 7900);
		System.out.println("5: " + name);
		
		sql = "select * from emp where empno = ?";
		Map<String, Object> map = template.queryForMap(sql, 7900);
		for(String key : map.keySet()) {
			System.out.println("6: "+key+ " : " + map.get(key));	
		}
		
		sql = "select * from emp where deptno = ?";
		List<Map<String, Object>> list = template.queryForList(sql, 20);
		for(Map<String, Object> item : list) {
			for(String key : item.keySet()) {
				System.out.println("7: "+key+ " : " + map.get(key));
			}
			System.out.println();
		}
		
		sql = "select sal from emp where deptno = ?";
		List<Integer> salary = template.queryForList(sql,Integer.class, 20);
		
		for(Integer key : salary) {
			System.out.println("8: "+key);
		}
		
		
	}
}
