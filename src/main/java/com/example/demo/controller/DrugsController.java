package com.example.demo.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.domain.Drugs;
import com.example.demo.service.DrugsService;
import com.example.demo.utils.Page;

@Controller
public class DrugsController {
	
	@Autowired
	private DrugsService drugsService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/drugs/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, String username, String describes, Model model) {
		// 条件查询所有客户
		Page<Drugs> drugs = drugsService
				.findDrugsList(page, rows, username, describes);
		model.addAttribute("page", drugs);
		
		// 添加参数
		model.addAttribute("username", drugs);
		model.addAttribute("describes", drugs);
		return "/WEB-INF/views/drugs.jsp";
	}
	
	//跳转添加用户
	@RequestMapping("/drugs/toAdd")
	public String addAA() {
		
		return "/WEB-INF/drugs/add.jsp";
	}
	
	//新增用户后重定向跳转到主页
	@RequestMapping("/drugs/add")
	public String addAll(@RequestParam("uploadfile") List<MultipartFile> uploadfile, //
				@RequestParam("username") String username, //
				@RequestParam("price") String price, //
				@RequestParam("stock") String stock, //
				@RequestParam("describes") String describes, //
				@RequestParam("term") String term
				) {
			Drugs drugs = new Drugs();
		if(!uploadfile.isEmpty() && uploadfile.size()>0) {
			for(MultipartFile file : uploadfile) {
				
				String originalFilename = file.getOriginalFilename();	
//				String dirPath = "F:\\learn_itheima\\2019 spring boot\\health_of_house_boot\\src\\main\\resources\\static\\images\\";
				String dirPath = "D:\\WOYAOXUEXI\\java1-8-work\\health_of_house_boot\\src\\main\\resources\\static\\images\\";			
				String newName = UUID.randomUUID() + originalFilename;
				drugs.setImage(newName);
				try {
					System.out.println(dirPath + newName);
					file.transferTo(new File(dirPath + newName));
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
		}
		
		
		drugs.setUsername(username);
		drugs.setPrice(price);
		drugs.setStock(stock);
		drugs.setDescribes(describes);
		drugs.setTerm(term);
		drugsService.createDrugs(drugs);
		return "redirect:/drugs/main.action";
	}
	
	//删除用户
	@RequestMapping("/drugs/deleteId")
	@ResponseBody
	public String delete(Integer id) {
		int row = drugsService.deleteDrugs(id);
		if(row > 0) {
			System.out.println("删除成功");
			return "OK";
		}else {
			return "FULL";
		}
	}
	
	//通过id查询用户,跳到更新用户页面
	@RequestMapping("/drugs/byId")
	public String ById(@RequestParam("id") Integer id,Model model) {
		Drugs drugs = drugsService.findDrugsById(id);
		model.addAttribute("drugs", drugs);
		return "/WEB-INF/drugs/update.jsp";
	}
	
	//更新用户
	@RequestMapping("/drugs/Update")
	public String update(Drugs drugs) {
		drugsService.updateDrugs(drugs);
		return "redirect:/drugs/main.action";
	}
}
