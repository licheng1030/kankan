package com.coilabs;

		import org.mybatis.spring.annotation.MapperScan;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.coilabs.mapper")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class KankanUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(KankanUserApplication.class, args);
	}
}
