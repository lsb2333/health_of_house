package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.dao.PhysiciansMapper;
import com.example.demo.domain.Physicians;
import com.example.demo.service.PhysiciansService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class PhysiciansServiceImpl implements PhysiciansService {
	
	@Autowired
	private PhysiciansMapper physiciansMapper;
	
	@Override
	public List<Physicians> selectPhysiciansList(Physicians physicians) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectPhysiciansListCount(Physicians physicians) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Physicians> findPhysiciansList(Integer page, Integer rows) {
		// 创建客户对象
		Physicians physicians = new Physicians();
		
		// 当前页
		physicians.setStart((page-1) * rows) ;
		// 每页数
		physicians.setRows(rows);
		// 查询客户列表
		List<Physicians> physicianss = 
				physiciansMapper.selectPhysiciansList(physicians);
		// 查询客户列表总记录数
		Integer count = physiciansMapper.selectPhysiciansListCount(physicians);
		// 创建Page返回对象
		Page<Physicians> result = new Page<>();
		result.setPage(page);
		result.setRows(physicianss);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
