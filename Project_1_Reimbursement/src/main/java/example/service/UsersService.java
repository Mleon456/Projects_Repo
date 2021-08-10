package example.service;

import example.model.Users;

public interface UsersService {
	
	public boolean findUser(Users user);
	
	public int findUserId(Users user_id);
	
	public int findUserRole(Users user_id);
	
}
