package com.chanchal.futures;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCaching
public class FirstExchangeServiceApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstExchangeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("First Exchange Consumer App started");
	}

}
