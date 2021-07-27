package dao;

import java.util.List;
import models.Users;

public interface UsersDao {
	
	public List<Users> selectAllUsers();
	
	public List<Users> selectUserById();
	
	public boolean addUser();
	
	public boolean removeUser();
	
	public boolean updateUser();
	
}
