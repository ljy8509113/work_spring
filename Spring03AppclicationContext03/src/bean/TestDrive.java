package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestDrive {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("./src/config/config.xml");
		PersonImpl bean01 = (PersonImpl) context.getBean("person");
		PersonImpl bean02 = (PersonImpl) context.getBean("person", PersonImpl.class);
		Person bean03 = context.getBean(Person.class);
		Person bean04 = context.getBean(PersonImpl.class);
		
		System.out.println(bean01 == bean02);
		
		bean01.sayHello();
		bean02.sayHello();
		bean03.sayHello();
		bean04.sayHello();
		
		System.out.println(bean01);
		System.out.println(bean02);
		System.out.println(bean03);
		System.out.println(bean04);
	}
}
