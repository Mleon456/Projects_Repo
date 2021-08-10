package example.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import example.model.Reimbursement;

public class ReimbursementDaoImpl implements ReimbursementDao {

	public static void main(String[] args) {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		ReimbursementDao rdi = new ReimbursementDaoImpl();
		System.out.println(rdi.selectAllReimbursements());
//		System.out.println(rdi.selectReimbursementById(2));
//		System.out.println(rdi.addReimbursement());
//		System.out.println(rdi.addReimbursement(new Reimbursement(500, "Food Money", 1, 2)));
//		System.out.println(rdi.addReimbursement(new Reimbursement(225, "Housing expenses", 1, 1)));
//		System.out.println(rdi.updateReimbursement(new Reimbursement(2, 1)));
	}

	@Override
	public List<Reimbursement> selectAllReimbursements() {

		List<Reimbursement> reimbursements = new ArrayList<>();

		try (Connection conn = CustomConnectionFactory.getConnection()) {

			String sql = "SELECT * FROM ers_reimbursement_join";

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				reimbursements.add(new Reimbursement(rs.getInt("REIMB_ID"), rs.getInt("REIMB_AMOUNT"),
						rs.getString("REIMB_SUBMITTED"), rs.getString("REIMB_RESOLVED"),
						rs.getString("REIMB_TYPE"), rs.getString("REIMB_DESCRIPTION"), rs.getString("USER_ROLE"),
						rs.getString("REIMB_STATUS")));
					System.out.println(rs.getString("REIMB_DESCRIPTION"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return reimbursements;
	}

	@Override
	public List<Reimbursement> selectReimbursementByName(Reimbursement reimb_id) {

		List<Reimbursement> reimbursements = new ArrayList<>();

		try (Connection conn = CustomConnectionFactory.getConnection()) {
			
			String sql = "SELECT * FROM ERS_REIMBURSEMENT_JOIN WHERE ers_username = ?;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, reimb_id.getReimb_username());

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				reimbursements.add(new Reimbursement(rs.getInt("REIMB_ID"), rs.getInt("REIMB_AMOUNT"),
						rs.getString("REIMB_SUBMITTED"), rs.getString("REIMB_RESOLVED"),
						rs.getString("REIMB_TYPE"), rs.getString("REIMB_DESCRIPTION"), rs.getString("USER_ROLE"),
						rs.getString("REIMB_STATUS")));
					System.out.println(rs.getString("REIMB_DESCRIPTION"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return reimbursements;
	}

	@Override
	public boolean addReimbursement(Reimbursement reimb) {

		try (Connection conn = CustomConnectionFactory.getConnection()) {

			String sql = "INSERT INTO ERS_REIMBURSEMENT (REIMB_ID, REIMB_AMOUNT,"
					+ " REIMB_SUBMITTED, REIMB_DESCRIPTION, REIMB_AUTHOR, "
					+ "REIMB_STATUS_ID, REIMB_TYPE_ID)"
					+ "VALUES (DEFAULT, ?, CURRENT_TIMESTAMP, ?, ?, 1, ?);";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, reimb.getReimb_Amount());
			ps.setString(2, reimb.getReimb_description());
			ps.setInt(3, reimb.getReimb_author());
			ps.setInt(4, reimb.getReimb_status_id());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean removeReimbursement(int reimb_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateReimbursement(Reimbursement reimb) {

		try (Connection conn = CustomConnectionFactory.getConnection()) {

			String sql = "UPDATE ERS_REIMBURSEMENT\r\n"
					+ "SET REIMB_STATUS_ID = ?, reimb_resolved = current_timestamp\r\n"
					+ "WHERE REIMB_ID = ?;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, reimb.getReimb_status_id());
			ps.setInt(2, reimb.getReimb_Id());
			
			System.out.println( reimb.getReimb_status_id());
			System.out.println(reimb.getReimb_Id());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
