package com.springboot.wsh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling 开启定时器功能，相当于任务调度的总开关
@EnableScheduling
public class SpringbootTaskschedulerApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringbootTaskschedulerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTaskschedulerApplication.class, args);
		logger.info("SpringBoot 定时任务调度系统启动!!!!");
	}
}
