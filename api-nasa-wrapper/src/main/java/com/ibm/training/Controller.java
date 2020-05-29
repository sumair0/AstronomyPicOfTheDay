package com.ibm.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class Controller {
	
	@Autowired
	RestTemplate restTemplate ;
	
	
	
	String urlBase = "https://api.nasa.gov/planetary/apod" ;
	String apiKey = "hRSsj4TjtaoVGu8celWJbHesg24KRjocE9B3bnNX" ;
	String url = urlBase + "?api_key=" + apiKey ;
	
	
	
	//For test hit
	@RequestMapping("/")
	String getTry() {
		return "Hit the root" ;
	}
	
	
	
	@GetMapping("/apod")
	ResponseEntity<String> getApod() {
//		System.out.println(url);
		return restTemplate.getForEntity(url, String.class ) ;
	}

}
