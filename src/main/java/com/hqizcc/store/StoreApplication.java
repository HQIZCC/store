package com.hqizcc.store;

import javax.servlet.Servlet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@MapperScan(basePackages="com.hqizcc.store.mapper")
public class StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}
	
//	@Bean
	public ServletRegistrationBean<Servlet> dispatcherRegistration(DispatcherServlet dispatcherServlet){
		ServletRegistrationBean<Servlet> reg = new ServletRegistrationBean<>(dispatcherServlet);
		reg.getUrlMappings().clear();
		reg.addUrlMappings("*.htm");
		return reg;
	}
} 
