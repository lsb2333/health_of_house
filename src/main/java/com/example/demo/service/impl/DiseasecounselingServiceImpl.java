package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DiseasecounselingMapper;
import com.example.demo.domain.Diseasecounseling;
import com.example.demo.service.DiseasecounselingService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class DiseasecounselingServiceImpl implements DiseasecounselingService {
	
	@Autowired
	private DiseasecounselingMapper diseasecounselingMapper;
	
	@Override
	public List<Diseasecounseling> selectDiseasecounselingList(Diseasecounseling diseasecounseling) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectDiseasecounselingListCount(Diseasecounseling diseasecounseling) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Diseasecounseling> findDiseasecounselingList(Integer page, Integer rows) {
		// 创建客户对象
		Diseasecounseling diseasecounseling = new Diseasecounseling();
		
		// 当前页
		diseasecounseling.setStart((page-1) * rows) ;
		// 每页数
		diseasecounseling.setRows(rows);
		// 查询客户列表
		List<Diseasecounseling> diseasecounselings = 
				diseasecounselingMapper.selectDiseasecounselingList(diseasecounseling);
		// 查询客户列表总记录数
		Integer count = diseasecounselingMapper.selectDiseasecounselingListCount(diseasecounseling);
		// 创建Page返回对象
		Page<Diseasecounseling> result = new Page<>();
		result.setPage(page);
		result.setRows(diseasecounselings);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
