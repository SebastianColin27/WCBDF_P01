package com.upiiz.jscb_P01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication

public class JscbP01Application {

	public static void main(String[] args) {
		SpringApplication.run(JscbP01Application.class, args);
	}

}
