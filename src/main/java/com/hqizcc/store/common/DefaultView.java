package com.hqizcc.store.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.hqizcc.store.model.ProjectUseModel;

/**
 * 放行静态资源
 * @author hq
 *
 */

@Configuration
public class DefaultView extends WebMvcConfigurationSupport {
	
	@Autowired
	private ProjectUseModel projectUseModel;
	
	@Autowired
	private BaseInterceptor baseInterceptor;

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(baseInterceptor).excludePathPatterns("/index.htm", "/static/**");
		super.addInterceptors(registry);
	}

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/upload").addResourceLocations(projectUseModel.getUploadUrl());
		super.addResourceHandlers(registry);
	}
	
}
