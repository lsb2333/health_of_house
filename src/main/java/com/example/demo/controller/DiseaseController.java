package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Disease;
import com.example.demo.service.DiseaseService;
import com.example.demo.utils.Page;

@Controller
public class DiseaseController {
	
	@Autowired
	private DiseaseService diseaseService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/disease/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Disease> disease = diseaseService
				.findDiseaseList(page, rows);
		model.addAttribute("page", disease);
		
		// 添加参数
		model.addAttribute("username", disease);
		return "/WEB-INF/views/disease.jsp";
	}
}
