package com.app.repository;

import java.util.List;

import com.app.pojo.Reimbursement;

public interface IReimbursementRepo {

	int insertReimbursement(Reimbursement rObj);

	List<Reimbursement> getAllReimbursements(int userId);

	int updateReimbursement(Reimbursement rObj);

	List<Reimbursement> getAllReimbursements();

}
