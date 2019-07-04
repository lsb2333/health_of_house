package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.domain.Management;
import com.example.demo.service.ManagementService;
import com.example.demo.utils.Page;

@Controller
public class ManagementController {
	
	@Autowired
	private ManagementService managementService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/management/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Management> management = managementService
				.findManagementList(page, rows);
		model.addAttribute("page", management);
		
		// 添加参数
		model.addAttribute("username", management);
		return "/WEB-INF/views/management.jsp";
	}
}
