package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Doctorvisits;

@Mapper
public interface DoctorvisitsMapper {

	//医生问诊列表
	public List<Doctorvisits> selectDoctorvisitsList(Doctorvisits doctorvisits);
			
	//医生问诊数
	public Integer selectDoctorvisitsListCount(Doctorvisits doctorvisits);
}
