package example.service;

import java.util.List;

import example.dao.ReimbursementDao;
import example.dao.ReimbursementDaoImpl;
import example.model.Reimbursement;

public class ReimbursementServiceImpl implements ReimbursementService {

	ReimbursementDao myDao = new ReimbursementDaoImpl();
	
	@Override
	public List<Reimbursement> selectAllReimbursements() {
		return myDao.selectAllReimbursements();
	}

	@Override
	public List<Reimbursement> selectReimbursementByName(Reimbursement reimb_id) {
		// TODO Auto-generated method stub
		return myDao.selectReimbursementByName(reimb_id);
	}

	@Override
	public boolean addReimbursement(Reimbursement reimb_id) {
		// TODO Auto-generated method stub
		return myDao.addReimbursement(reimb_id);
	}

	@Override
	public boolean removeReimbursement(Reimbursement reimb_id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateReimbursement(Reimbursement reimb_id) {
		// TODO Auto-generated method stub
		return myDao.updateReimbursement(reimb_id);
	}

}
