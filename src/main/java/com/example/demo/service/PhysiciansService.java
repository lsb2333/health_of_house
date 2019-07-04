package com.example.demo.service;

import java.util.List;
import com.example.demo.domain.Physicians;
import com.example.demo.utils.Page;

public interface PhysiciansService {
	
	//药品列表
	public List<Physicians> selectPhysiciansList(Physicians physicians);
			
	//药品数
	public Integer selectPhysiciansListCount(Physicians physicians);
	
	// 查询客户列表
	public Page<Physicians> findPhysiciansList(Integer page, Integer rows);
	
}
