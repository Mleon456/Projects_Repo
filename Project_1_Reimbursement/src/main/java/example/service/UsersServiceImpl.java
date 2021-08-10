package example.service;


import example.dao.UsersDao;
import example.dao.UsersDaoImpl;
import example.model.Users;

public class UsersServiceImpl implements UsersService {
	
	UsersDao myDao = new UsersDaoImpl();


	@Override
	public boolean findUser(Users user) {
		return myDao.findUser(user);
	}


	@Override
	public int findUserId(Users user_id) {
		return myDao.findUserId(user_id);
	}


	@Override
	public int findUserRole(Users user_id) {
		return myDao.findUserRole(user_id);
	}

}
