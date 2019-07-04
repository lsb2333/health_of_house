package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.Drugs;

@Mapper
public interface DrugsMapper {
	
	//药品列表
	public List<Drugs> selectDrugsList(Drugs drugs);
			
	//药品数
	public Integer selectDrugsListCount(Drugs drugs);
	
	//添加药品
	public int createDrugs(Drugs drugs);
	
	//删除药品
	public int deleteDrugs(Integer id);
	
	//根据id查询药品信息
	public Drugs findDrugsById(@Param("id") int id);
	
	//根据id更新药品
	public int updateDrugs(Drugs drugs);
}
