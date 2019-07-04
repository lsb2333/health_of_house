package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.domain.Information;
import com.example.demo.service.InformationService;
import com.example.demo.utils.Page;

@Controller
public class InformationController {
	
	@Autowired
	private InformationService informationService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/information/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Information> information = informationService
				.findInformationList(page, rows);
		model.addAttribute("page", information);
		
		// 添加参数
		model.addAttribute("username", information);
		return "/WEB-INF/views/information.jsp";
	}
}
