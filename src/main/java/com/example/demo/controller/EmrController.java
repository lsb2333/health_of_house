package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.domain.Emr;
import com.example.demo.service.EmrService;
import com.example.demo.utils.Page;

@Controller
public class EmrController {
	
	@Autowired
	private EmrService emrService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/emr/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Emr> emr = emrService
				.findEmrList(page, rows);
		model.addAttribute("page", emr);
		
		// 添加参数
		model.addAttribute("username", emr);
		return "/WEB-INF/views/emr.jsp";
	}
}
