package org.springboot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class MySpringBootApplication {
	public static void main(String[] args) throws InterruptedException {
		// 入口运行类
		SpringApplication.run(MySpringBootApplication.class, args);
		Thread.sleep(50 * 1000);
	}
}