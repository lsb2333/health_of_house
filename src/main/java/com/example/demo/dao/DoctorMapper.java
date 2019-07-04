package com.example.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.demo.domain.Doctor;

@Mapper
public interface DoctorMapper {
	
	//医生列表
	public List<Doctor> selectDoctorList(Doctor doctor);
				
	//医生数
	public Integer selectDoctorListCount(Doctor doctor);
	
	//添加医生
	public int createDoctor(Doctor doctor);
	
	//删除医生
	public int deleteDoctor(Integer id);
	
	//根据id查询医生信息
	public Doctor findDoctorById(@Param("id") int id);
	
	//根据id更新医生信息
	public int updateDoctor(Doctor doctor);
}
