package dao;

import java.sql.Timestamp;
import java.util.List;
import models.Reimbursement;

public interface ReimbursementDao {
	
	public List<Reimbursement> selectAllReimbursements();
	
	public List<Reimbursement> selectReimbursementById(int reimb_id);
		
	public boolean addReimbursement(int reimb_id, double reimb_amount, Timestamp reimb_submitted, String reimb_receipt, String reimb_author, String reimb_status, String reimb_type);
	
	public boolean removeReimbursement(int reimb_id);
	
	public boolean updateReimbursement(int reimb_id);

}
