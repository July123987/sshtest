package com.crm.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.crm.bean.Cust;
import com.crm.service.CustService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SaveCustomerAcion extends ActionSupport {

	private Cust cust;
	private CustService service;
	List strList = new ArrayList();

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

	public List getStrList() {
		return strList;
	}

	public void setStrList(List strList) {
		this.strList = strList;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest req = ServletActionContext.getRequest();
		for (int i = 0; i < strList.size(); i++) {
			// if(strList.get(i))
			// Type tyep = (Type) this.strList.get(i);
		}
		this.cust.setSex(this.strList.get(0).toString());
		this.service.saveCustomer(cust);
		return SUCCESS;
	}

}
