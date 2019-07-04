package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Disease;


@Mapper
public interface DiseaseMapper {
	
	//疾病列表
	public List<Disease> selectDiseaseList(Disease disease);
			
	//疾病数
	public Integer selectDiseaseListCount(Disease disease);
}
