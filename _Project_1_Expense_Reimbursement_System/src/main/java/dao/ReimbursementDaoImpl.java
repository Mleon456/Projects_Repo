package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import models.Reimbursement;

public class ReimbursementDaoImpl implements ReimbursementDao {

	public static void main(String[] args) {
		ReimbursementDao rdi = new ReimbursementDaoImpl();
		System.out.println(rdi.selectAllReimbursements());
//		System.out.println(rdi.selectReimbursementById(2));
	}

	@Override
	public List<Reimbursement> selectAllReimbursements() {

		List<Reimbursement> reimbursements = new ArrayList<>();

		try (Connection conn = CustomConnectionFactory.getConnection()) {

			String sql = "SELECT DISTINCT ON (ERS_USERS) reimb_amount, reimb_submitted, reimb_description, user_role, reimb_status, reimb_type, ers_username"
					+ " FROM ERS_REIMBURSEMENT, ERS_USERS, ERS_Reimbursement_status, ERS_Reimbursement_type, ERS_USER_ROLES"
					+ " ORDER BY ERS_USERS;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				reimbursements.add(new Reimbursement(rs.getInt(1), rs.getTimestamp(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getTimestamp(2));	
			System.out.println(rs.getString(3));	
			System.out.println(rs.getString(4));	
			System.out.println(rs.getString(5));	
			System.out.println(rs.getString(6));	
			System.out.println(rs.getString(7));
			}
			
//			System.out.println(reimbursements);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return reimbursements;
	}

	@Override
	public List<Reimbursement> selectReimbursementById(int reimb_id) {
		
		List<Reimbursement> reimbursements = new ArrayList<>();

		try (Connection conn = CustomConnectionFactory.getConnection()) {

			String sql = "SELECT * FROM ERS_REIMBURSEMENT WHERE reimb_id = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, reimb_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				reimbursements.add(new Reimbursement(rs.getInt(1), rs.getDouble(2), rs.getTimestamp(3),
						rs.getTimestamp(4), rs.getString(5), null, null, null, null, null));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return reimbursements;

	}

	@Override
	public boolean addReimbursement(int reimb_id, double reimb_amount, Timestamp reimb_submitted, String reimb_receipt,
			String reimb_author, String reimb_status, String reimb_type) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean removeReimbursement(int reimb_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateReimbursement(int reimb_id) {
		// TODO Auto-generated method stub
		return false;
	}



}
