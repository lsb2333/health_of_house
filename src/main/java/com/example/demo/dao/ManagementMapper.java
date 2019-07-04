package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Management;

@Mapper
public interface ManagementMapper {
	
	//健康列表
	public List<Management> selectManagementList(Management management);
					
	//健康数
	public Integer selectManagementListCount(Management management);
}
