package com.crm.service;

import java.util.List;

import com.crm.bean.Cust;

public interface CustService {

	/**
	 * 保存客户信息
	 * @param cust
	 */
	public void saveCustomer(Cust cust);

	/**
	 * 删除客户信息
	 * @param cust
	 */
	public void removeCustomer(Cust cust);

	/**
	 * 查询客户信息
	 * @param id
	 * @return
	 */
	public Cust findCustomerById(Integer id);

	/**
	 * 查询所有客户信息
	 * @param id
	 * @return
	 */
	public List<Cust> findAllCust();
	
	/**
	 * 通过条件查询客户信息
	 * @param cust
	 * @return
	 */
	public List<Cust> findCustByCondition(Cust cust);
	
	/**
	 * 修改客户信息
	 * @param cust
	 */
	public void updateCustomer(Cust cust);
}
