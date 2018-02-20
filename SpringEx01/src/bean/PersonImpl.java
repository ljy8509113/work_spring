package bean;

public class PersonImpl implements Person {

	private String name;
	
	public PersonImpl() {	
	}
	
	public PersonImpl(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
