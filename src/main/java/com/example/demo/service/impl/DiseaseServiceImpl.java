package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DiseaseMapper;
import com.example.demo.domain.Disease;
import com.example.demo.service.DiseaseService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class DiseaseServiceImpl implements DiseaseService {
	
	@Autowired
	private DiseaseMapper diseaseMapper;
	
	@Override
	public List<Disease> selectDiseaseList(Disease disease) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectDiseaseListCount(Disease disease) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Disease> findDiseaseList(Integer page, Integer rows) {
		// 创建客户对象
		Disease disease = new Disease();
		
		// 当前页
		disease.setStart((page-1) * rows) ;
		// 每页数
		disease.setRows(rows);
		// 查询客户列表
		List<Disease> diseases = 
				diseaseMapper.selectDiseaseList(disease);
		// 查询客户列表总记录数
		Integer count = diseaseMapper.selectDiseaseListCount(disease);
		// 创建Page返回对象
		Page<Disease> result = new Page<>();
		result.setPage(page);
		result.setRows(diseases);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
