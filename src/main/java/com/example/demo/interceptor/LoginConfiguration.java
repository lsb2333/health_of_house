package com.example.demo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfiguration implements WebMvcConfigurer{
	
	@Autowired
	private LoginInterceptor loginInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//添加拦截对象
		registry.addInterceptor(loginInterceptor) //
				//拦截所有路径
				.addPathPatterns("/**") //
				//除了哪些路径
				.excludePathPatterns("/xiaosheng/login","/xiaosheng/tologin","/", //
									"/css/**","/js/**","/images/**","/fonts/**");
		
	}

}
