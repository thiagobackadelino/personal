package com.br.personal.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.br.personal.auth.model.property.JwtConfiguration;

@SpringBootApplication
@EnableConfigurationProperties(value = JwtConfiguration.class)
public class PersonalAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalAuthApplication.class, args);
	}

}
