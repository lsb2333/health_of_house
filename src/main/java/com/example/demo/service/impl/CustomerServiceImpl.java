package com.example.demo.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.CustomerMapper;
import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<Customer> selectCustomerList(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectCustomerListCount(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Customer> findCustomerList(Integer page, Integer rows, String username) {
		// 创建客户对象
		Customer student = new Customer();
		// 判断客户名称
		if(StringUtils.isNotBlank(username)){
			student.setUsername(username);
		}
		// 当前页
		student.setStart((page-1) * rows) ;
		// 每页数
		student.setRows(rows);
		// 查询客户列表
		List<Customer> customers = 
				customerMapper.selectCustomerList(student);
		// 查询客户列表总记录数
		Integer count = customerMapper.selectCustomerListCount(student);
		// 创建Page返回对象
		Page<Customer> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
	
	
	@Override
	public int deleteCustomer(Integer id) {
		
		return customerMapper.deleteCustomer(id);
	}

	@Override
	public int createCustomer(Customer customer) {

		return customerMapper.createCustomer(customer);
	}

	@Override
	public Customer findById(int id) {
		
		return customerMapper.findById(id);
	}

	@Override
	public int updateCustomer(Customer customer) {
		
		return customerMapper.updateCustomer(customer);
	}

}
