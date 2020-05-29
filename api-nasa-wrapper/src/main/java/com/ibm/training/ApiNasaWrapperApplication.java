package com.ibm.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import com.ibm.training.WebConfig;

@SpringBootApplication
public class ApiNasaWrapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNasaWrapperApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate() ;
	}

}
