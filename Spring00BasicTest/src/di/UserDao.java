package di;

public interface UserDao {
	public void insert(User user);
	public User select(int id);
}
