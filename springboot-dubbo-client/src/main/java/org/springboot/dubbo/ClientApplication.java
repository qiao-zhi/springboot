package org.springboot.dubbo;

import java.util.List;

import org.springboot.dubbo.bean.User;
import org.springboot.dubbo.controller.UserController;
import org.springboot.dubbo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class ClientApplication {
	public static void main(String[] args) {
		// 入口运行类
		ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
		UserController bean = run.getBean(UserController.class);
		List<User> allUsers = bean.getAllUsers();
		System.out.println(allUsers);

		User user = bean.getUserByUserName("zhangsan");
		System.out.println(user);
	}
}
