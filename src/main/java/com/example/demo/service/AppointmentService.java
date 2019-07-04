package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Appointment;
import com.example.demo.utils.Page;

public interface AppointmentService {
	
	//预约挂号列表
	public List<Appointment> selectAppointmentList(Appointment appointment);
			
	//预约挂号数
	public Integer selectAppointmentListCount(Appointment appointment);
	
	// 查询预约挂号列表
	public Page<Appointment> findAppointmentList(Integer page, Integer rows);
}
