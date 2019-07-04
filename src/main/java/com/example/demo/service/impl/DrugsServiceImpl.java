package com.example.demo.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DrugsMapper;
import com.example.demo.domain.Drugs;
import com.example.demo.service.DrugsService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class DrugsServiceImpl implements DrugsService{
	
	@Autowired
	private DrugsMapper drugsMapper;
	
	@Override
	public List<Drugs> selectDrugsList(Drugs drugs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectDrugsListCount(Drugs drugs) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public Page<Drugs> findDrugsList(Integer page, Integer rows, String username, String describes) {
		// 创建药品对象
		Drugs drugs = new Drugs();
		// 判断客户名称
		if(StringUtils.isNotBlank(username)){
			drugs.setUsername(username);
		}
		//判断药品描述
		if(StringUtils.isNotBlank(describes)) {
			drugs.setDescribes(describes);
		}
		// 当前页
		drugs.setStart((page-1) * rows) ;
		// 每页数
		drugs.setRows(rows);
		// 查询药品列表
		List<Drugs> drugss = 
				drugsMapper.selectDrugsList(drugs);
		// 查询药品列表总记录数
		Integer count = drugsMapper.selectDrugsListCount(drugs);
		// 创建Page返回对象
		Page<Drugs> result = new Page<>();
		result.setPage(page);
		result.setRows(drugss);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

	@Override
	public int createDrugs(Drugs drugs) {
		// TODO Auto-generated method stub
		return drugsMapper.createDrugs(drugs);
	}
	
	@Override
	public int deleteDrugs(Integer id) {
		// TODO Auto-generated method stub
		return drugsMapper.deleteDrugs(id);
	}

	@Override
	public Drugs findDrugsById(int id) {
		// TODO Auto-generated method stub
		return drugsMapper.findDrugsById(id);
	}

	@Override
	public int updateDrugs(Drugs drugs) {
		// TODO Auto-generated method stub
		return drugsMapper.updateDrugs(drugs);
	}

	
	
}
