package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DoctorvisitsMapper;
import com.example.demo.domain.Doctorvisits;
import com.example.demo.service.DoctorvisitsService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class DoctorvisitsServiceImpl implements DoctorvisitsService {
	
	@Autowired
	private DoctorvisitsMapper doctorvisitsMapper;
	
	@Override
	public List<Doctorvisits> selectDoctorvisitsList(Doctorvisits doctorvisits) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectDoctorvisitsListCount(Doctorvisits doctorvisits) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Doctorvisits> findDoctorvisitsList(Integer page, Integer rows) {
		// 创建客户对象
		Doctorvisits doctorvisits = new Doctorvisits();
		
		// 当前页
		doctorvisits.setStart((page-1) * rows) ;
		// 每页数
		doctorvisits.setRows(rows);
		// 查询客户列表
		List<Doctorvisits> Doctorvisitss = 
				doctorvisitsMapper.selectDoctorvisitsList(doctorvisits);
		// 查询客户列表总记录数
		Integer count = doctorvisitsMapper.selectDoctorvisitsListCount(doctorvisits);
		// 创建Page返回对象
		Page<Doctorvisits> result = new Page<>();
		result.setPage(page);
		result.setRows(Doctorvisitss);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
