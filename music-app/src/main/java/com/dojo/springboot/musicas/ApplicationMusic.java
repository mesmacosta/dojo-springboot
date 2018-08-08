package com.dojo.springboot.musicas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@SpringBootApplication
@EnableCaching
public class ApplicationMusic {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMusic.class, args);
		
	}

	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor() {
	  return new MethodValidationPostProcessor();
	}
}
