package com.coilabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class KankanRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(KankanRedisApplication.class, args);
	}
}
