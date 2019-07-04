package com.example.demo.service;

import java.util.List;
import com.example.demo.domain.Information;
import com.example.demo.utils.Page;

public interface InformationService {
	
	//通知信息列表
	public List<Information> selectInformationList(Information information);
			
	//通知信息数
	public Integer selectInformationListCount(Information information);
	
	// 查询通知信息列表
	public Page<Information> findInformationList(Integer page, Integer rows);
}
