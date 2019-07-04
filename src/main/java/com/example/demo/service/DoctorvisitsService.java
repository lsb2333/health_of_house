package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Doctorvisits;
import com.example.demo.utils.Page;

public interface DoctorvisitsService {
	
	//医生问诊列表
	public List<Doctorvisits> selectDoctorvisitsList(Doctorvisits doctorvisits);
			
	//医生问诊数
	public Integer selectDoctorvisitsListCount(Doctorvisits doctorvisits);
	
	// 查询医生问诊列表
	public Page<Doctorvisits> findDoctorvisitsList(Integer page, Integer rows);
}
