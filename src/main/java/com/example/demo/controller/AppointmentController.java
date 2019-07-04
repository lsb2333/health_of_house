package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Appointment;
import com.example.demo.service.AppointmentService;
import com.example.demo.utils.Page;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/appointment/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Appointment> appointment = appointmentService
				.findAppointmentList(page, rows);
		model.addAttribute("page", appointment);
		
		// 添加参数
		model.addAttribute("username", appointment);
		return "/WEB-INF/views/appointment.jsp";
	}
}
