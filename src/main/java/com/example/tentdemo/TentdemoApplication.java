package com.example.tentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.tentdemo.*"})
@EntityScan(basePackages = {"com.example.tentdemo.entity"})
//@EnableJpaRepositories(basePackages = "com.example.tentdemo.repository")
//@EnableJpaRepositories("com.example.tentdemo.*")
@EnableJpaRepositories
public class TentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TentdemoApplication.class, args);
	}

}
