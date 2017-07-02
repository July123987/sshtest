package com.crm.service.impl;

import java.util.List;

import com.crm.bean.Cust;
import com.crm.dao.CustDao;
import com.crm.service.CustService;


public class CustServiceImpl implements CustService{

	CustDao custDao;
	
	public CustDao getCustDao() {
		return custDao;
	}

	public void setCustDao(CustDao custDao) {
		this.custDao = custDao;
	}

	public List<Cust> findAllCust() {
		// TODO Auto-generated method stub
		return this.custDao.findAllCust();
	}

	public Cust findCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return this.custDao.findCustomerById(id);
	}

	public void removeCustomer(Cust cust) {
		// TODO Auto-generated method stub
		this.custDao.removeCustomer(cust);
	}

	public void saveCustomer(Cust cust) {
		// TODO Auto-generated method stub
		this.custDao.saveCustomer(cust);
	}

	public List<Cust> findCustByCondition(Cust cust) {
		// TODO Auto-generated method stub
		return this.custDao.findCustByCondition(cust);
	}

	@Override
	public void updateCustomer(Cust cust) {
		// TODO Auto-generated method stub
		this.custDao.updateCustomer(cust);
	}

}
