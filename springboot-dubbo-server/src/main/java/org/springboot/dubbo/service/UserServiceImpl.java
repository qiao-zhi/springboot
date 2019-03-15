package org.springboot.dubbo.service;

import java.util.ArrayList;
import java.util.List;

import org.springboot.dubbo.bean.User;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0") // dubbo的service注解，不具备spring的@service注解的功能
@Component
public class UserServiceImpl implements UserService {

	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 20; i++) {
			User user = new User("usernnamei" + i, "password" + i);
			users.add(user);
		}

		return users;
	}

	public User getUserByUserName(String username) {
		return new User(username, username);
	}
}