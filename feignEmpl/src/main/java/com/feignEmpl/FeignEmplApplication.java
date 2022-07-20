package com.feignEmpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignEmplApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignEmplApplication.class, args);
	}

}
