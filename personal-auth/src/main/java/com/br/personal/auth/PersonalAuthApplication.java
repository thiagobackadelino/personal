package com.br.personal.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.br.personal.core.property.JwtConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EntityScan({"com.br.personal.core.model"})
@EnableJpaRepositories({"com.br.personal.core.repository"})
@EnableEurekaClient
@EnableConfigurationProperties(value = JwtConfiguration.class)
@ComponentScan("com.br.personal")
public class PersonalAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalAuthApplication.class, args);
	}

}
