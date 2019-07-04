package com.example.demo.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DoctorMapper;
import com.example.demo.domain.Doctor;
import com.example.demo.service.DoctorService;
import com.example.demo.utils.Page;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorMapper doctorMapper;
	
	@Override
	public List<Doctor> selectDoctorList(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer selectDoctorListCount(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Doctor> findDoctorList(Integer page, Integer rows, String username) {
		// 创建客户对象
		Doctor doctor = new Doctor();
		// 判断客户名称
		if(StringUtils.isNotBlank(username)){
			doctor.setUsername(username);
		}
		// 当前页
		doctor.setStart((page-1) * rows) ;
		// 每页数
		doctor.setRows(rows);
		// 查询客户列表
		List<Doctor> customers = 
				doctorMapper.selectDoctorList(doctor);
		// 查询客户列表总记录数
		Integer count = doctorMapper.selectDoctorListCount(doctor);
		// 创建Page返回对象
		Page<Doctor> result = new Page<>();
		result.setPage(page);
		result.setRows(customers);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

	@Override
	public int createDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorMapper.createDoctor(doctor);
	}

	@Override
	public int deleteDoctor(Integer id) {
		// TODO Auto-generated method stub
		return doctorMapper.deleteDoctor(id);
	}

	@Override
	public Doctor findDoctorById(int id) {
		// TODO Auto-generated method stub
		return doctorMapper.findDoctorById(id);
	}

	@Override
	public int updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorMapper.updateDoctor(doctor);
	}

}
