package com.inova.importapi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"com.inova.importapi.entidades"})
@EnableJpaRepositories(basePackages = {"com.inova.importapi.repository"})
@ComponentScan(basePackages = {"com.inova.importapi.servicos", "com.inova.importapi.controller"})

@SpringBootApplication
public class ImportapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImportapiApplication.class, args);
	}

}
