package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Doctorvisits;
import com.example.demo.service.DoctorvisitsService;
import com.example.demo.utils.Page;

@Controller
public class DoctorvisitsController {

	@Autowired
	private DoctorvisitsService doctorvisitsService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/doctorvisits/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Doctorvisits> doctorvisits = doctorvisitsService
				.findDoctorvisitsList(page, rows);
		model.addAttribute("page", doctorvisits);
		
		// 添加参数
		model.addAttribute("username", doctorvisits);
		return "/WEB-INF/views/doctorvisits.jsp";
	}
}
