package dao;

import java.util.List;
import models.ReimbursementType;

public interface ReimbursementTypeDao {
	
	public List<ReimbursementType> selectAllReimbursementTypes();
	
	public List<ReimbursementType> selectReimbursementTypeById();
	
	public boolean addReimbursementType();
	
	public boolean removeReimbursementType();
	
	public boolean updateReimbursementType();

}
