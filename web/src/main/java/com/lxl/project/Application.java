package com.lxl.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 开启自动配置
 * @SpringBootApplication是一个组合注解
 * 组合了 @Configuration、
 * @EnableAutoConfiguration、根据类路径中的jar包依赖为当前项目进行自动配置
 * @ComponentScan
 * 关闭特定的自动配置应用使用@SpringBootApplication注解的exclude参数
 * @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {
		/**
		 * 修改启动类，继承SpringBootServletInitializer 并重写configure方法
		 * @param application
		 * @return
		 */
		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
				return application.sources(Application.class);
		}

		/**
		 * 项目启动入口
		 * @param args
		 */
		public static void main(String[] args) {
				SpringApplication.run(Application.class, args);
		}
}
