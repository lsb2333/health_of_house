package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Health_Insurance;
import com.example.demo.utils.Page;

public interface Health_InsuranceService {
	
	//医保列表
	public List<Health_Insurance> selectHealth_InsuranceList(Health_Insurance health_Insurance);
			
	//医保数
	public Integer selectHealth_InsuranceListCount(Health_Insurance health_Insurance);
	
	// 查询医保列表
	public Page<Health_Insurance> findHealth_InsuranceList(Integer page, Integer rows);
}
