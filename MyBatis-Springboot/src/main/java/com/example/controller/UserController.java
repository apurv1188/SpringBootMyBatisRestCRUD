package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dao.UserMapper;
import com.example.model.User;

import java.util.List;


@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;

			
	@RequestMapping("/users")
	public List<User> users() {
		return userMapper.findAll();
	}

	@RequestMapping("/users/{userName}")
	public List<User> userByuserName(@PathVariable("userName") String userName) {
		return userMapper.findByuserName(userName);
	}
	}