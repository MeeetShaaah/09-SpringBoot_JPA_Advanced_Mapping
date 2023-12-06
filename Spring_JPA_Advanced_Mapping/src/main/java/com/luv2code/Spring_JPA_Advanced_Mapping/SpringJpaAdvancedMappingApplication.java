package com.luv2code.Spring_JPA_Advanced_Mapping;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaAdvancedMappingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaAdvancedMappingApplication.class, args);
    }

    @Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner-> {
			System.out.println("Hello World...!!!");
		};
	}
}
