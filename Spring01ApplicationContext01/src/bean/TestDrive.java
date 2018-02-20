package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestDrive {
	public static void main(String[] args) {
//		MyBean bean = new MyBean();
//		bean.sayHello();
		
		ApplicationContext context = new GenericXmlApplicationContext("/config/applicationContext.xml");
		
		MyBean bean2 = (MyBean)context.getBean("mybean");
		bean2.sayHello();
	}
}
