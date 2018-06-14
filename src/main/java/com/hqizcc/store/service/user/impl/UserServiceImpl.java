package com.hqizcc.store.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqizcc.store.mapper.UserMapper;
import com.hqizcc.store.model.User;
import com.hqizcc.store.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		
		return userMapper.findAll();
	}

}
