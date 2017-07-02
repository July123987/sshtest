package com.crm.action;

import java.util.Map;

import com.crm.service.CustService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ListCustomerAcion extends ActionSupport{

	private CustService listAllService;

	public void setListAllService(CustService listAllService) {
		this.listAllService = listAllService;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		Map map = (Map)ActionContext.getContext().get("request");
		map.put("list", this.listAllService.findAllCust());
		return SUCCESS;
	}

}
