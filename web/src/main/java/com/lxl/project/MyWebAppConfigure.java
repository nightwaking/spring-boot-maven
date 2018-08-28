package com.lxl.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfigure implements WebMvcConfigurer {
	// 通过Bean注入TokenCheckInterceptor
	@Bean
	public HandlerInterceptor TokenCheckInterceptor() {return new TokenCheckInterceptor();}
}
