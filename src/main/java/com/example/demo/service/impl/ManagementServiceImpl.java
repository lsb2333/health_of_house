package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dao.ManagementMapper;
import com.example.demo.domain.Management;
import com.example.demo.service.ManagementService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class ManagementServiceImpl implements ManagementService {
	
	@Autowired
	private ManagementMapper managementMapper;
	
	@Override
	public List<Management> selectDoctorList(Management management) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectManagementListCount(Management management) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Management> findManagementList(Integer page, Integer rows) {
		// 创建客户对象
		Management management = new Management();
		
		// 当前页
		management.setStart((page-1) * rows) ;
		// 每页数
		management.setRows(rows);
		// 查询客户列表
		List<Management> managements = 
				managementMapper.selectManagementList(management);
		// 查询客户列表总记录数
		Integer count = managementMapper.selectManagementListCount(management);
		// 创建Page返回对象
		Page<Management> result = new Page<>();
		result.setPage(page);
		result.setRows(managements);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
