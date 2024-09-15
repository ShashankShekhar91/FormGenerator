package com.formgenerator.Generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = { "com.*" })
@EnableJpaRepositories("com.*")
@EntityScan("com.*")
public class GeneratorApplication {

	public static void main(String[] args) {

		SpringApplication.run(GeneratorApplication.class);
	}

}
