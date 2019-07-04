package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Health_Insurance;

@Mapper
public interface Health_InsuranceMapper {

	//医保列表
	public List<Health_Insurance> selectHealth_InsuranceList(Health_Insurance health_Insurance);
			
	//医保数
	public Integer selectHealth_InsuranceListCount(Health_Insurance health_Insurance);
}
