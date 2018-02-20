package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import model.Job;
@Repository //Transaction 사용을 하려면 Dao 클래스에 @Repository를 작성해야 한다.
public class TxDao {
	@Autowired
	private JdbcTemplate template;
	
	public void insert(Job job) {
		StringBuilder sql = new StringBuilder();
		sql.append("insert into job(job_id, job_title, min_salary, max_salary) ");
		sql.append("values (?,?,?,?)");
		
		template.update(sql.toString(), job.getJobId(), job.getJobTitle(), job.getMinSalary(), job.getMaxSalary());
		
	}
	
	public void update(Job job) {
		String sql = "update job set job_title=?, max_salary=?, min_salary=? where job_id=?";
		template.update(sql, job.getJobTitle(), job.getMaxSalary(), job.getMinSalary(), job.getJobId());
		
	}
}
