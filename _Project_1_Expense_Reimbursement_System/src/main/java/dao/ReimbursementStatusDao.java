package dao;

import java.util.List;
import models.ReimbursementStatus;

public interface ReimbursementStatusDao {
	
	public List<ReimbursementStatus> selectAllReimbursementStatuses();
	
	public List<ReimbursementStatus> selectReimbursementStatusById();
	
	public boolean addReimbursementStatus();
	
	public boolean removeReimbursementStatus();
	
	public boolean updateReimbursementStatus();
}
