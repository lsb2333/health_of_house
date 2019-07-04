package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.domain.Diseasecounseling;
import com.example.demo.service.DiseasecounselingService;
import com.example.demo.utils.Page;

@Controller
public class DiseasecounselingController {
	
	@Autowired
	private DiseasecounselingService diseasecounselingService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/diseasecounseling/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, Model model) {
		// 条件查询所有客户
		Page<Diseasecounseling> diseasecounseling = diseasecounselingService
				.findDiseasecounselingList(page, rows);
		model.addAttribute("page", diseasecounseling);
		
		// 添加参数
		model.addAttribute("username", diseasecounseling);
		return "/WEB-INF/views/diseasecounseling.jsp";
	}
}
