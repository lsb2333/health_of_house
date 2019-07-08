package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@MapperScan("com.example.demo.dao")
public class HealthOfHouseBootApplication extends SpringBootServletInitializer{

	//进入登录页面
	@RequestMapping("/")
	public String index() {
		return "/index.jsp";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HealthOfHouseBootApplication.class, args);
	}
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(HealthOfHouseBootApplication.class);
	}
	
}
