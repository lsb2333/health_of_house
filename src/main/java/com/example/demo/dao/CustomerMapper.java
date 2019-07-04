package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.demo.domain.Customer;

@Mapper
public interface CustomerMapper {
	
	//客户列表
	public List<Customer> selectCustomerList(Customer customer);
			
	//客户数
	public Integer selectCustomerListCount(Customer customer);
	
	//添加用户
	public int createCustomer(Customer customer);
	
	//删除用户
	public int deleteCustomer(Integer id);
	
	//根据id查询信息
	public Customer findById(@Param("id") int id);
	
	//根据id更新用户
	public int updateCustomer(Customer customer);
	
}
