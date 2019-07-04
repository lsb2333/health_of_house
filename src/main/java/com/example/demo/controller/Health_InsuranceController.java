package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.domain.Health_Insurance;
import com.example.demo.service.Health_InsuranceService;
import com.example.demo.utils.Page;

@Controller
public class Health_InsuranceController {
		
	@Autowired
	private Health_InsuranceService health_InsuranceService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/health_Insurance/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Health_Insurance> health_Insurance = health_InsuranceService
				.findHealth_InsuranceList(page, rows);
		model.addAttribute("page", health_Insurance);
		
		// 添加参数
		model.addAttribute("username", health_Insurance);
		return "/WEB-INF/views/health_Insurance.jsp";
	}
}
