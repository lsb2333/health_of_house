package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.InformationMapper;
import com.example.demo.domain.Information;
import com.example.demo.service.InformationService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class InformationServiceImpl implements InformationService {

	@Autowired
	private InformationMapper informationMapper;
	
	@Override
	public List<Information> selectInformationList(Information information) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectInformationListCount(Information information) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Information> findInformationList(Integer page, Integer rows) {
		// 创建客户对象
		Information information = new Information();
		
		// 当前页
		information.setStart((page-1) * rows) ;
		// 每页数
		information.setRows(rows);
		// 查询客户列表
		List<Information> informations = 
				informationMapper.selectInformationList(information);
		// 查询客户列表总记录数
		Integer count = informationMapper.selectInformationListCount(information);
		// 创建Page返回对象
		Page<Information> result = new Page<>();
		result.setPage(page);
		result.setRows(informations);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

}
