package dao;

import java.util.List;
import models.UserRoles;

public interface UserRolesDao {

	public List<UserRoles> selectAllUserRoles();

	public List<UserRoles> selectUserRoleById();

	public boolean addUserRole();

	public boolean removeUserRole();

	public boolean updateUserRole();

}
