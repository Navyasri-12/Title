package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Reimbursement;
import com.app.repository.IReimbursementRepo;

@Service
public class ReimbursementSrvImpl implements IReimbursementSrv {

	@Autowired
	private IReimbursementRepo reimbursementRepo;
	public void setReimburesementRepo(IReimbursementRepo reimbursementRepo) {
		this.reimbursementRepo = reimbursementRepo;
	}

	public String applyReimbursement(Reimbursement rObj) {
		int result = reimbursementRepo.insertReimbursement(rObj);
		if (result != 0) {
			return "Reimbursement applied successfully";
		} else {
			return "Reimbursement application failed";
		}
	}

	public List<Reimbursement> getReimbursements(int userId) {
		List<Reimbursement> reimbursements = reimbursementRepo.getAllReimbursements(userId);
		return reimbursements;
	}

	public String updateReimbursements(Reimbursement rObj) {
		int result = reimbursementRepo.updateReimbursement(rObj);
		if (result != 0) {
			return "Reimbursement updation success";
		} else {
			return "Reimbursement updation failure";
		}
	}

	public List<Reimbursement> getAllReimbursements() {
		return reimbursementRepo.getAllReimbursements();
	}
}
