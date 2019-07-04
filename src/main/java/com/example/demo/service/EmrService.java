package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Emr;
import com.example.demo.utils.Page;

public interface EmrService {
	
	//预约挂号列表
	public List<Emr> selectEmrList(Emr emr);
			
	//预约挂号数
	public Integer selectEmrListCount(Emr emr);
	
	// 查询预约挂号列表
	public Page<Emr> findEmrList(Integer page, Integer rows);
}
