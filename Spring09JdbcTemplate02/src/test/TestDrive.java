package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dao.TxDao;
import model.Job;

public class TestDrive {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/config/config.xml");
		TxDao dao = context.getBean(TxDao.class);
		Job job = new Job("A01", "개발자", 200, 1000);
		
		dao.insert(job);
	}
}
