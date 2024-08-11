package com.example.got_api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.got_api"})
public class GotApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GotApiApplication.class, args);
	}

}
