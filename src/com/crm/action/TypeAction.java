package com.crm.action;

import java.util.ArrayList;
import java.util.List;

import com.crm.bean.Type;
import com.opensymphony.xwork2.ActionSupport;

public class TypeAction extends ActionSupport {
	private List<Type> strList = new ArrayList<Type>();

	public List<Type> getStrList() {
		List<Type> list = new ArrayList<Type>();
		Type type1 = new Type();
		type1.setId("1");
		type1.setName("男");
		Type type2 = new Type();
		type2.setId("2");
		type2.setName("女");
		Type type3 = new Type();
		type3.setId("3");
		type3.setName("其他");
		list.add(type1);
		list.add(type2);
		list.add(type3);
		this.strList = list;
		return strList;
	}

	public void setStrList(List<Type> strList) {
		this.strList = strList;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
