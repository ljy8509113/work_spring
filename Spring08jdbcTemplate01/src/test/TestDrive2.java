package test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import model.Dep;
import model.Emp;

public class TestDrive2 {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/config/config.xml");
		JdbcTemplate template =  context.getBean(JdbcTemplate.class);
		
		String sql = "select * from emp where empno = ?";
		Emp emp = template.queryForObject(sql, new MyRowMapper(), 7839);
		System.out.println(emp.toString());
		
		sql = "select * from emp where deptno=?";
		List<Emp> empList = template.query(sql, new MyRowMapper(), 10);
		for(Emp e : empList) {
			System.out.println(e);
		}
		System.out.println();
		
		sql = "select * from emp where empno=?";
		emp = template.queryForObject(sql, new BeanPropertyRowMapper<Emp>(Emp.class), 7839);
		System.out.println(emp);
		
		sql = "select * from emp where deptno=?";
		empList = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class), 10);
		for(Emp e : empList) {
			System.out.println("4: "+e);
		}
		System.out.println();
		
		//join
		StringBuilder sql02 = new StringBuilder();
		sql02.append("select * from dept d, emp e ");
		sql02.append("where d.deptno = e.deptno ");
		sql02.append("and d.deptno=?");
		
		ResultSetExtractor<Dep> extractor = new ResultSetExtractor<Dep>() {

			@Override
			public Dep extractData(ResultSet rs) throws SQLException, DataAccessException {
				Dep d = null;
				
				if(rs.next()) {
					d = new Dep();
					d.setDeptno(rs.getInt("deptno"));
					d.setDname(rs.getString("dname"));
					d.setLoc(rs.getString("loc"));
					
					do {
						Emp emp = new Emp();
						emp.setComm(rs.getInt("comm"));
						emp.setDeptno(rs.getInt("deptno"));
						emp.setEmpno(rs.getInt("empno"));
						emp.setEname(rs.getString("ename"));
						emp.setHireDate(rs.getDate("hiredate"));
						emp.setJob(rs.getString("job"));
						emp.setMgr(rs.getInt("mgr"));
						emp.setSal(rs.getInt("sal"));
						d.getEmployeeList().add(emp);
					}while(rs.next());
				}
				
				return d;
			}
		};
		
		Dep d = template.query(sql02.toString(), extractor, 10);
		System.out.println(d);
		System.out.println();
		
	}
}

class MyRowMapper implements RowMapper<Emp>{

	@Override
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Emp emp = new Emp();
		emp.setComm(rs.getInt("comm"));
		emp.setDeptno(rs.getInt("deptno"));
		emp.setEmpno(rs.getInt("empno"));
		emp.setEname(rs.getString("ename"));
		emp.setHireDate(rs.getDate("hiredate"));
		emp.setJob(rs.getString("job"));
		emp.setMgr(rs.getInt("mgr"));
		emp.setSal(rs.getInt("sal"));
		
		return emp;
	}
	
}