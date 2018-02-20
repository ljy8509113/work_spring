package di;

import java.util.HashMap;
import java.util.Map;

public class MyUserDao implements UserDao{
	Map<Integer, User> table = new HashMap();
	
	public void insert(User user) {
		table.put(user.getId(), user);
	}
	
	public User select(int id) {
		return table.get(id);
	}
	
}
