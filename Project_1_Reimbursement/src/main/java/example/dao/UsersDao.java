package example.dao;

import java.util.List;

import example.model.Users;

public interface UsersDao {
	
	public boolean findUser(Users user);
	
	public int findUserId(Users user); 
	
	public int findUserRole(Users user);
}
