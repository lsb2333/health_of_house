package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.example.demo.domain.Appointment;

@Mapper
public interface AppointmentMapper {

	//预约挂号列表
	public List<Appointment> selectAppointmentList(Appointment diseasecounseling);
			
	//预约挂号询数
	public Integer selectAppointmentListCount(Appointment diseasecounseling);
}
