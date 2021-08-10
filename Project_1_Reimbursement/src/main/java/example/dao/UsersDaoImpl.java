package example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import example.model.Users;

public class UsersDaoImpl implements UsersDao {
	
	public static void main(String[] args) {
		UsersDaoImpl myDao = new UsersDaoImpl();
		System.out.println(myDao.findUser(new Users( "username" , "password")));
	}
	
	public boolean findUser(Users user) {
		//my arraylist
		Users targetUser = null;
		
		try(Connection conn = CustomConnectionFactory.getConnection()){
			
			String sql = "SELECT * FROM ERS_USERS WHERE ers_username = ? AND ers_password = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getUser_name());
			ps.setString(2, user.getUser_password());
			
			ResultSet rs = ps.executeQuery(); //<--query not update
		
			if(rs.next()) {
				targetUser = new Users(rs.getString("ers_username"), rs.getString("ers_password"));
			}
			
					
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
				}
		
		return true;
		
	}
	
	
	public int findUserId(Users user) {
		//my arraylist
		Users users_id = null;
		
		int userId = 0;
		try(Connection conn = CustomConnectionFactory.getConnection()){
			
			String sql = "SELECT ers_users_id FROM ERS_USERS WHERE ers_username = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getUser_name());
			
			ResultSet rs = ps.executeQuery(); //<--query not update
		
			if(rs.next()) {
				userId = (rs.getInt("ers_users_id"));
			}
			
					
			}catch(SQLException e) {
				e.printStackTrace();
				return userId;
				}
		
		return userId;
		
	}
	
	public int findUserRole(Users user) {
		//my arraylist
		Users users_id = null;
		
		int userId = 0;
		try(Connection conn = CustomConnectionFactory.getConnection()){
			
			String sql = "SELECT user_role_id FROM ers_users WHERE ers_username = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getUser_name());
			
			ResultSet rs = ps.executeQuery(); //<--query not update
		
			if(rs.next()) {
				userId = (rs.getInt("user_role_id"));
			}
			
					
			}catch(SQLException e) {
				e.printStackTrace();
				return userId;
				}
		
		return userId;
		
	}

}
