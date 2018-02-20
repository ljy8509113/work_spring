package annotation02;

public class TestDrive {
	public static void main(String[] args) {
		User u = new User("일이삼사오륙칠팔구십1", 33, "seoul");
		User k = new User("kim", 20, null);
		User p = new User("pack", 101, "busan");
		
		Validator v = new Validator();
		try {
			v.validate(u);
			v.validate(k);
			v.validate(p);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
