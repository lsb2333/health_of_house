package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.Health_InsuranceMapper;
import com.example.demo.domain.Health_Insurance;
import com.example.demo.service.Health_InsuranceService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class Health_InsuranceImpl implements Health_InsuranceService {
	
	@Autowired
	private Health_InsuranceMapper health_InsuranceMapper;
	
	@Override
	public List<Health_Insurance> selectHealth_InsuranceList(Health_Insurance health_Insurance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectHealth_InsuranceListCount(Health_Insurance health_Insurance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Health_Insurance> findHealth_InsuranceList(Integer page, Integer rows) {
		// 创建客户对象
		Health_Insurance health_Insurance = new Health_Insurance();
		
		// 当前页
		health_Insurance.setStart((page-1) * rows) ;
		// 每页数
		health_Insurance.setRows(rows);
		// 查询客户列表
		List<Health_Insurance> health_Insurances = 
				health_InsuranceMapper.selectHealth_InsuranceList(health_Insurance);
		// 查询客户列表总记录数
		Integer count = health_InsuranceMapper.selectHealth_InsuranceListCount(health_Insurance);
		// 创建Page返回对象
		Page<Health_Insurance> result = new Page<>();
		result.setPage(page);
		result.setRows(health_Insurances);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
