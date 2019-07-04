package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmrMapper;
import com.example.demo.domain.Emr;
import com.example.demo.service.EmrService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class EmrServiceImpl implements EmrService {

	@Autowired
	private EmrMapper emrMapper;
	
	@Override
	public List<Emr> selectEmrList(Emr emr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectEmrListCount(Emr emr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Emr> findEmrList(Integer page, Integer rows) {
		// 创建客户对象
		Emr emr = new Emr();
		
		// 当前页
		emr.setStart((page-1) * rows) ;
		// 每页数
		emr.setRows(rows);
		// 查询客户列表
		List<Emr> emrs = 
				emrMapper.selectEmrList(emr);
		// 查询客户列表总记录数
		Integer count = emrMapper.selectEmrListCount(emr);
		// 创建Page返回对象
		Page<Emr> result = new Page<>();
		result.setPage(page);
		result.setRows(emrs);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
