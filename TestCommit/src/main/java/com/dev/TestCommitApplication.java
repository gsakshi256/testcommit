package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.dev")
@SpringBootApplication
public class TestCommitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestCommitApplication.class, args);
	}

}
