package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDrive {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MyBean bean = context.getBean("myBean", MyBean.class);
		bean.sayHello();
	}
}
