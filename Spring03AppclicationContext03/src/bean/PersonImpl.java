package bean;

public class PersonImpl implements Person{

	String greeting = "안녕하세요";
	String name = "현빈";
	int age = 36;
	
	public PersonImpl() {
		System.out.println("personImpl");
	}
	
	public PersonImpl(String greeting) {
		this.greeting = greeting;
	}
	
	public PersonImpl(int age) {
		this.age = age;
	}
	
	public PersonImpl(String greeting, String name, int age) {
		this.greeting = greeting;
		this.age = age;
		this.name = name;			
	}
	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("name : " + name + " / age : " + age + " / greeting: "+ greeting);
	}

}
