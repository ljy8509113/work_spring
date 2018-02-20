package di;

public class TestDrive {
	public static void main(String[] args) {
		User user1 = new User(1, 27, "Lee");
//		DI-1
//		MyUserDao dao = new MyUserDao();
//		DI-2
//		UserDao dao = new MyUserDao();
//		DI-3 Factory 이용
		UserDao dao = DaoFactory.getDao("my");
		
		
		dao.insert(user1);
		
		User select = dao.select(1);
		
		System.out.println(select);
	}
}
