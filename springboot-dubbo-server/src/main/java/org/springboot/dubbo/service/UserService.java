package org.springboot.dubbo.service;

import java.util.List;

import org.springboot.dubbo.bean.User;

public interface UserService {
	List<User> getAllUsers();

	User getUserByUserName(String username);
}
