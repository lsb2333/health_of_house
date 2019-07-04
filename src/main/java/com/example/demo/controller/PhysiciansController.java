package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.domain.Physicians;
import com.example.demo.service.PhysiciansService;
import com.example.demo.utils.Page;

@Controller
public class PhysiciansController {
	
	@Autowired
	private PhysiciansService physiciansService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/physicians/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Physicians> physicians = physiciansService
				.findPhysiciansList(page, rows);
		model.addAttribute("page", physicians);
		
		// 添加参数
		model.addAttribute("username", physicians);
		return "/WEB-INF/views/physicians.jsp";
	}
}
