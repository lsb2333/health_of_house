package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Information;

@Mapper
public interface InformationMapper {
	
	//通知信息列表
	public List<Information> selectInformationList(Information information);
			
	//通知信息数
	public Integer selectInformationListCount(Information information);
}
