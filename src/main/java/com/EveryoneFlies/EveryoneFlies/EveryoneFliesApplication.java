package com.EveryoneFlies.EveryoneFlies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class})
public class EveryoneFliesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EveryoneFliesApplication.class, args);
	}

}
