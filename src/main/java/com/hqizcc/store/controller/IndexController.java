package com.hqizcc.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hqizcc.store.model.ProjectUseModel;
import com.hqizcc.store.model.User;
import com.hqizcc.store.service.user.UserService;

@Controller
public class IndexController {

	@Autowired
	private ProjectUseModel resource;

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/index")
	public String toIndex(ModelMap modelMap) {
		
		List<User> userList = userService.findAll();
		
		System.out.println(resource.toString());
		modelMap.addAttribute("resource", resource);
		modelMap.addAttribute("userList", userList);
		
		return "index";
	}
}
