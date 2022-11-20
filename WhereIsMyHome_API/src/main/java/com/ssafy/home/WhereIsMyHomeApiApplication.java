package com.ssafy.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ssafy.home"})
@MapperScan(basePackages = {"com.ssafy.home.*.dao"})
public class WhereIsMyHomeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhereIsMyHomeApiApplication.class, args);
	}

}
