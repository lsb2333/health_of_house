package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.AppointmentMapper;
import com.example.demo.domain.Appointment;
import com.example.demo.service.AppointmentService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AppointmentMapper appointmentMapper;
	
	@Override
	public List<Appointment> selectAppointmentList(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectAppointmentListCount(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Appointment> findAppointmentList(Integer page, Integer rows) {
		// 创建客户对象
		Appointment appointment = new Appointment();
		
		// 当前页
		appointment.setStart((page-1) * rows) ;
		// 每页数
		appointment.setRows(rows);
		// 查询客户列表
		List<Appointment> appointments = 
				appointmentMapper.selectAppointmentList(appointment);
		// 查询客户列表总记录数
		Integer count = appointmentMapper.selectAppointmentListCount(appointment);
		// 创建Page返回对象
		Page<Appointment> result = new Page<>();
		result.setPage(page);
		result.setRows(appointments);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}
	

}
