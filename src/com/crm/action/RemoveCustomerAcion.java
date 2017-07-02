package com.crm.action;

import com.crm.bean.Cust;
import com.crm.service.CustService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class RemoveCustomerAcion extends ActionSupport{

	private Cust customer;
	private CustService removeService;

	public Cust getCustomer() {
		return customer;
	}


	public void setCustomer(Cust customer) {
		this.customer = customer;
	}

	public void setRemoveService(CustService removeService) {
		this.removeService = removeService;
	}


	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		this.removeService.removeCustomer(customer);
		return SUCCESS;
	}

}
