package com.app.service;

import java.util.List;

import com.app.pojo.Reimbursement;

public interface IReimbursementSrv {

	String applyReimbursement(Reimbursement rObj);

	List<Reimbursement> getReimbursements(int userId);

	String updateReimbursements(Reimbursement rObj);

	List<Reimbursement> getAllReimbursements();

}