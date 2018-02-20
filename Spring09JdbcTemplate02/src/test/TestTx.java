package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import model.Job;
import service.TxService;

public class TestTx {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/config/config.xml");
		
		TxService service = context.getBean(TxService.class);
		service.save(new Job("AAA","title",200, 900));
	}
}
