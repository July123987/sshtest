package com.crm.action;

import com.crm.bean.Cust;
import com.crm.service.CustService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdatePreviewCustAction extends ActionSupport {

	private CustService updatePreviewCustService;
	private Cust customer;

	public Cust getCustomer() {
		return customer;
	}

	public void setCustomer(Cust customer) {
		this.customer = customer;
	}

	public CustService getUpdatePreviewCustService() {
		return updatePreviewCustService;
	}

	public void setUpdatePreviewCustService(CustService updatePreviewCustService) {
		this.updatePreviewCustService = updatePreviewCustService;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		customer = this.updatePreviewCustService.findCustomerById(customer
				.getId());
		return SUCCESS;
	}

}
