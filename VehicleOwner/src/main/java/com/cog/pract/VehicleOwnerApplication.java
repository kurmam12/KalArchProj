package com.cog.pract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.cog.pract.repository")
public class VehicleOwnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleOwnerApplication.class, args);
	}

}
