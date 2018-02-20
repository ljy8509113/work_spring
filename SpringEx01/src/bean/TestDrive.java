package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestDrive {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("/config/config.xml");
		PersonService service = (PersonService) context.getBean("person");
		
		//만든 객체로 2-2 에서 구현한 메소드 호출
		service.getName();
	}
	
	/*
	 * config.xml 설정
	 * xml 방식 autowire 설정
	 */
}
