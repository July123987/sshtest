package com.crm.action;

import java.util.ArrayList;
import java.util.List;

import com.crm.bean.Cust;
import com.crm.service.CustService;
import com.opensymphony.xwork2.ActionSupport;

public class CustSaveAction extends ActionSupport{

	private CustService service;
	private Cust cust;
	List strList = new ArrayList();
	
	public List getStrList() {
		return strList;
	}

	public void setStrList(List strList) {
		this.strList = strList;
	}

	public Cust getCust() {
		return cust;
	}

	public void setCust(Cust cust) {
		this.cust = cust;
	}

	public CustService getService() {
		return service;
	}

	public void setService(CustService service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.service.saveCustomer(cust);
		return SUCCESS;
	}

	
	
	
}
