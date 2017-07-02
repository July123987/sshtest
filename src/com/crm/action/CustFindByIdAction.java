package com.crm.action;


import com.crm.bean.Cust;
import com.crm.service.CustService;
import com.opensymphony.xwork2.ActionSupport;

public class CustFindByIdAction extends ActionSupport {

	private CustService custFindByIdService;
	private Cust customer;

	public void setCustFindByIdService(CustService custFindByIdService) {
		this.custFindByIdService = custFindByIdService;
	}

	public Cust getCustomer() {
		return customer;
	}

	public void setCustomer(Cust customer) {
		this.customer = customer;
	}


	public CustService getCustFindByIdService() {
		return custFindByIdService;
	}



	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.custFindByIdService.findCustomerById(customer.getId());
		return SUCCESS;
	}

}
