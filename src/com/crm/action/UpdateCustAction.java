package com.crm.action;

import java.util.ArrayList;
import java.util.List;

import com.crm.bean.Cust;
import com.crm.service.CustService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateCustAction extends ActionSupport {
	private CustService updateCustService;
	private Cust customer;
	List strList = new ArrayList();

	public List getStrList() {
		return strList;
	}

	public void setStrList(List strList) {
		this.strList = strList;
	}

	public CustService getUpdateCustService() {
		return updateCustService;
	}

	public void setUpdateCustService(CustService updateCustService) {
		this.updateCustService = updateCustService;
	}

	public Cust getCustomer() {
		return customer;
	}

	public void setCustomer(Cust customer) {
		this.customer = customer;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.customer.setSex(this.strList.get(0).toString());
		this.updateCustService.updateCustomer(customer);
		return SUCCESS;
	}
}
