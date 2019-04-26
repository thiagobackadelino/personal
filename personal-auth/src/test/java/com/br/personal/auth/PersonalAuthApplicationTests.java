package com.br.personal.auth;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonalAuthApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void tests() {
		System.out.println(new BCryptPasswordEncoder().encode("Personal"));
		
	}

}