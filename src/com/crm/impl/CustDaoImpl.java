package com.crm.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.crm.bean.Cust;
import com.crm.dao.CustDao;

public class CustDaoImpl extends HibernateDaoSupport implements CustDao{

	@SuppressWarnings("unchecked")
	public List<Cust> findAllCust() {
		// TODO Auto-generated method stub
		String hql = "from Cust cust order by cust.id desc";
		return (List<Cust>)this.getHibernateTemplate().find(hql);
	}

	public Cust findCustomerById(Integer id) {
		// TODO Auto-generated method stub
		Cust cust = (Cust)this.getHibernateTemplate().get(Cust.class,id);
		return cust;
	}

	public void removeCustomer(Cust cust) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(cust);
	}

	public void saveCustomer(Cust cust) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(cust);
	}

	@SuppressWarnings("unchecked")
	public List<Cust> findCustByCondition(Cust cust) {
		// TODO Auto-generated method stub
		StringBuffer strBuffer = new StringBuffer();
		String hql = "from Cust cust where 1=1 ";
		strBuffer.append(hql);
		if(cust == null){
			throw new NullPointerException("查询条件不能为空！");
		}
		if(!"".equals(cust.getCustname())){
			String custname = " and custname = '"+cust.getCustname()+"'";
			strBuffer.append(custname);
		}
		if(!"".equals(cust.getCustno())){
			String custname = " and custno = '"+cust.getCustno()+"'";
			strBuffer.append(custname);
		}
		String orderBy = " order by cust.id desc";
		strBuffer.append(orderBy);
		List<Cust> custList = this.getHibernateTemplate().find(strBuffer.toString());
		//return (List<Cust>)this.getHibernateTemplate().find(strBuffer.toString());
		return custList;
	}

	@Override
	public void updateCustomer(Cust cust) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(cust);
	}

}
