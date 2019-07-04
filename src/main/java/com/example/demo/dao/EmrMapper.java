package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Emr;

@Mapper
public interface EmrMapper {

	//电子病历列表
	public List<Emr> selectEmrList(Emr emr);
			
	//电子病历数
	public Integer selectEmrListCount(Emr emr);
}
