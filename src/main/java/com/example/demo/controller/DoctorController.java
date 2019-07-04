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

import com.example.demo.domain.Doctor;
import com.example.demo.service.DoctorService;
import com.example.demo.utils.Page;

@Controller
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/doctor/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, String username, Model model) {
		// 条件查询所有客户
		Page<Doctor> doctor = doctorService
				.findDoctorList(page, rows, username);
		model.addAttribute("page", doctor);
		
		// 添加参数
		model.addAttribute("username", doctor);
		return "/WEB-INF/views/doctor.jsp";
	}
	
	//跳转添加用户
	@RequestMapping("/doctor/toAdd")
	public String addAA() {
		
		return "/WEB-INF/doctor/add.jsp";
	}
	
	//新增用户后重定向跳转到主页
	@RequestMapping("/doctor/add")
	public String addAll(@RequestParam("uploadfile") List<MultipartFile> uploadfile, //
			@RequestParam("username") String username, //
			@RequestParam("section") String section, //
			@RequestParam("describes") String describes, //
			@RequestParam("recommendation") String recommendation, //
			@RequestParam("years") int years) {
		
			Doctor doctor = new Doctor();
		if(!uploadfile.isEmpty() && uploadfile.size()>0) {
			for(MultipartFile file : uploadfile) {
				
				String originalFilename = file.getOriginalFilename();	
//				String dirPath = "F:\\learn_itheima\\2019 spring boot\\health_of_house_boot\\src\\main\\resources\\static\\images\\";
				String dirPath = "D:\\WOYAOXUEXI\\java1-8-work\\health_of_house_boot\\src\\main\\resources\\static\\images\\";			
				String newName = UUID.randomUUID() + originalFilename;
				doctor.setImage(newName);
				try {
					System.out.println(dirPath + newName);
					file.transferTo(new File(dirPath + newName));
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				
			}
		}
		doctor.setUsername(username);
		doctor.setSection(section);
		doctor.setDescribes(describes);
		doctor.setRecommendation(recommendation);
		doctor.setYears(years);
		doctorService.createDoctor(doctor);
		return "redirect:/xiaosheng/doctor/main.action";
	}
	
	//删除用户
	@RequestMapping("/doctor/deleteId")
	@ResponseBody
	public String delete(Integer id) {
		int row = doctorService.deleteDoctor(id);
		if(row > 0) {
			System.out.println("删除成功");
			return "OK";
		}else {
			return "FULL";
		}
	}
	
	//通过id查询用户,跳到更新用户页面
	@RequestMapping("/doctor/byId")
	public String ById(@RequestParam("id") Integer id,Model model) {
		Doctor doctor = doctorService.findDoctorById(id);
		model.addAttribute("doctor", doctor);
		return "/WEB-INF/doctor/update.jsp";
	}
	
	//更新用户
	@RequestMapping("/doctor/Update")
	public String update(Doctor doctor) {
		doctorService.updateDoctor(doctor);
		return "redirect:/xiaosheng/doctor/main.action";
	}
}
