package com.hqizcc.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class IndexController {
	
	private static final String VIEW_BASE = "index/";

	/**
	 * 跳转到登录首页
	 * @return
	 */
	@RequestMapping(value="/index")
	public String toIndex() {
		
		return VIEW_BASE + "index";
	}
	
	@RequestMapping(value="/image/upload", method=RequestMethod.POST)
	@ResponseBody
	public String toUpload(MultipartFile file) {
		
		return "ok";
	}
}
