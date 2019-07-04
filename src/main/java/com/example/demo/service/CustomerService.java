package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.Customer;
import com.example.demo.utils.Page;

public interface CustomerService {
	
	//客户列表
	public List<Customer> selectCustomerList(Customer customer);
		
	//客户数
	public Integer selectCustomerListCount(Customer customer);
		
	// 查询客户列表
	public Page<Customer> findCustomerList(Integer page, Integer rows, String username);
	
	//添加用户
	public int createCustomer(Customer customer);
	
	//删除用户
	public int deleteCustomer(Integer id);
	
	//根据id查询信息
	public Customer findById(@Param("id") int id);
	
	//根据id更新用户
	public int updateCustomer(Customer customer);
}
