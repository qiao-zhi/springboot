package org.springboot.dubbo;

import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class MySpringBootApplication {
	public static void main(String[] args) throws InterruptedException {
		// 入口运行类
		SpringApplication.run(MySpringBootApplication.class, args);

		CountDownLatch countDownLatch = new CountDownLatch(1);
		countDownLatch.await();
	}
}