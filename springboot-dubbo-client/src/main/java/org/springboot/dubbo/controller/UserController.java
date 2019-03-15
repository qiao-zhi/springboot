package org.springboot.dubbo.controller;

import java.util.List;

import org.springboot.dubbo.bean.User;
import org.springboot.dubbo.service.UserService;
import org.springframework.stereotype.Controller;

import com.alibaba.dubbo.config.annotation.Reference;

@Controller
public class UserController {
	@Reference(version = "1.0.0")
	UserService userService;

	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	public User getUserByUserName(String username) {
		return userService.getUserByUserName(username);
	}
}
