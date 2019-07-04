package com.example.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.demo.domain.Doctor;
import com.example.demo.utils.Page;

public interface DoctorService {
	
	//客户列表
	public List<Doctor> selectDoctorList(Doctor doctor);
		
	//客户数
	public Integer selectDoctorListCount(Doctor doctor);
		
	// 查询客户列表
	public Page<Doctor> findDoctorList(Integer page, Integer rows, String username);
	
	//添加医生
	public int createDoctor(Doctor doctor);
	
	//删除医生
	public int deleteDoctor(Integer id);
	
	//根据id查询医生信息
	public Doctor findDoctorById(@Param("id") int id);
	
	//根据id更新医生信息
	public int updateDoctor(Doctor doctor);
}
