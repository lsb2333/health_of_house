package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

	@Select("select * from customer where username = #{username} and password = #{password}")
	public Customer findCus(@Param("username") String username,@Param("password") String password);

	@Select("select * from customer where username = #{username}")
	public Customer findByUsername(String username);

	@Insert("insert into customer(username,names,password,status) values (#{username},#{names},#{password},1)")
	public boolean insertCus(@Param("username") String username,@Param("names") String names,@Param("password") String password);
	
}
