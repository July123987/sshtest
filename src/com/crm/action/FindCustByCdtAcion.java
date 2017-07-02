package com.crm.action;

import java.util.Map;

import com.crm.bean.Cust;
import com.crm.service.CustService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindCustByCdtAcion extends ActionSupport{

	private Cust cust;
	private CustService findCdtService;
	public Cust getCust() {
		return cust;
	}
	public void setCust(Cust cust) {
		this.cust = cust;
	}
	public CustService getFindCdtService() {
		return findCdtService;
	}
	public void setFindCdtService(CustService findCdtService) {
		this.findCdtService = findCdtService;
	}
	@SuppressWarnings({ "unchecked", "unchecked" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map map = (Map)ActionContext.getContext().get("request");
		map.put("list", this.findCdtService.findCustByCondition(cust));
		return SUCCESS;
	}
	
	
	
	
}
