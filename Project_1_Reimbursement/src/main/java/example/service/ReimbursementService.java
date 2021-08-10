package example.service;

import java.sql.Timestamp;
import java.util.List;

import example.model.Reimbursement;

public interface ReimbursementService {
	
	//READ
	public List<Reimbursement> selectAllReimbursements();

	public List<Reimbursement> selectReimbursementByName(Reimbursement reimb_id);

	public boolean addReimbursement(Reimbursement reimb_id);

	public boolean removeReimbursement(Reimbursement reimb_id);

	public boolean updateReimbursement(Reimbursement reimb_id);

}
