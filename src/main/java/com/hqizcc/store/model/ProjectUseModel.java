package com.hqizcc.store.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 用于项目的以下通用的了
 * @author hq
 *
 */
@Configuration
@ConfigurationProperties(prefix="com.hqizcc.projectusemodel")
@PropertySource(value="classpath:resource.properties")
public class ProjectUseModel {

	private String uploadUrl;

	public String getUploadUrl() {
		return uploadUrl;
	}

	public void setUploadUrl(String uploadUrl) {
		this.uploadUrl = uploadUrl;
	}
	
	
}
