package bean;

public class PersonService {
	
	// 2-1. 필드 만들기
	public Person person;
	
	public PersonService() {
		
	}
	
	public PersonService(Person person) {
		this.person = person;
	}
	
	// 2-2. person 객체의 getName() 호출하여 그 값을 출력하는 메소드 만들기
	public void sayname() {
		System.out.println(person.getName());
	}
	

}
