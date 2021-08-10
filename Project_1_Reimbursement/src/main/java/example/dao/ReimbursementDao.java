package example.dao;

import java.sql.Timestamp;
import java.util.List;
import example.model.Reimbursement;

public interface ReimbursementDao {
	
	public List<Reimbursement> selectAllReimbursements();
	
	public List<Reimbursement> selectReimbursementByName(Reimbursement reimb_id);
		
	public boolean addReimbursement(Reimbursement reimb);
	
	public boolean removeReimbursement(int reimb_id);
	
	public boolean updateReimbursement(Reimbursement reimb);

}
