package com.example.demo.service;

import java.util.List;
import com.example.demo.domain.Management;
import com.example.demo.utils.Page;

public interface ManagementService {
	
	//客户列表
	public List<Management> selectDoctorList(Management management);
		
	//客户数
	public Integer selectManagementListCount(Management management);
		
	// 查询客户列表
	public Page<Management> findManagementList(Integer page, Integer rows);
}
