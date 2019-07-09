package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.utils.Page;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("login")
	public String login() {
		return "redirect:/";
	}
	
	//判断登录
	@RequestMapping("tologin")
	public String login(@RequestParam("username") String username, //
						@RequestParam("password") String password, //
						Model model , HttpSession session ) {
		
		//通过账户和密码查询用户
		Customer customer = customerService.findCus(username, password);
		if(customer != null) {
			// 将用户添加到sessionuser
			session.setAttribute("CUSTOMER_SESSION", customer);
			// 跳转到主页面
			return "redirect:/customer/main.action";
		}
		model.addAttribute("msg", "账号或密码错误");
		return "/WEB-INF/views/login.jsp";
	}
	
	
	
	@RequestMapping("register")
	public String toRegister() {
		return "/WEB-INF/views/register.jsp";
	}

	/**
     * 用户注册
     */
    @RequestMapping(value="/register.action")
    public String register(Customer cus, Map<String,Object> map) {
    	Customer username = customerService.findByUsername(cus.getUsername());
    	
    	System.out.println("user_code="+username);
    	if(username == null) {
    		customerService.insertCus(cus.getUsername(), cus.getNames(), cus.getPassword());
        	map.put("msg", "注册成功！");
    		return "/WEB-INF/views/success.jsp";
    	}
    	map.put("msg","该账户已经存在，请重新注册！");
		return "register";
    }
	
	/**
	 *  客户列表
	 */
	@RequestMapping(value = "/customer/main.action")
	public String list(@RequestParam(defaultValue="1")Integer page,
			@RequestParam(defaultValue="5")Integer rows, String username, Model model) {
		// 条件查询所有客户
		Page<Customer> customer = customerService
				.findCustomerList(page, rows, username);
		model.addAttribute("page", customer);
		
		// 添加参数
		model.addAttribute("username", customer);
		return "/WEB-INF/views/main.jsp";
	}
	
	//退出登录
	@RequestMapping("/outlogin")
	public String outlogin(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
//	//跳转添加用户
//	@RequestMapping("/customer/toAdd")
//	public String addAA() {
//		
//		return "/WEB-INF/customer/add.jsp";
//	}
	
	//新增用户后重定向跳转到主页
	@RequestMapping("/customer/add")
	@ResponseBody
	public String addAll(Customer customer) {
		int	row = customerService.createCustomer(customer);
		if(row > 0) {
			return "OK";
		}else {
			return "FAIL";
		}
	}
	
	//删除用户
	@RequestMapping("customer/deleteId")
	@ResponseBody
	public String delete(Integer id) {
		int row = customerService.deleteCustomer(id);
		if(row > 0) {
			System.out.println("删除成功");
			return "OK";
		}else {
			return "FULL";
		}
	}
	
	//通过id查询用户,跳到更新用户页面
	@RequestMapping("/customer/byId")
	@ResponseBody
	public Customer ById(@RequestParam("id") Integer id) {
		Customer customer = customerService.findById(id);
		return customer;
	}
	
	//更新用户
	@RequestMapping("/customer/Update")
	@ResponseBody
	public String update(Customer customer) {
		int row = customerService.updateCustomer(customer);
		if(row > 0) {
			return "OK";
		}else {
			return "FAIL";
		}
	}
}
