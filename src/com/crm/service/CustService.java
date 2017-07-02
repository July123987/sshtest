package com.crm.service;

import java.util.List;

import com.crm.bean.Cust;

public interface CustService {

	/**
	 * ����ͻ���Ϣ
	 * @param cust
	 */
	public void saveCustomer(Cust cust);

	/**
	 * ɾ���ͻ���Ϣ
	 * @param cust
	 */
	public void removeCustomer(Cust cust);

	/**
	 * ��ѯ�ͻ���Ϣ
	 * @param id
	 * @return
	 */
	public Cust findCustomerById(Integer id);

	/**
	 * ��ѯ���пͻ���Ϣ
	 * @param id
	 * @return
	 */
	public List<Cust> findAllCust();
	
	/**
	 * ͨ��������ѯ�ͻ���Ϣ
	 * @param cust
	 * @return
	 */
	public List<Cust> findCustByCondition(Cust cust);
	
	/**
	 * �޸Ŀͻ���Ϣ
	 * @param cust
	 */
	public void updateCustomer(Cust cust);
}
