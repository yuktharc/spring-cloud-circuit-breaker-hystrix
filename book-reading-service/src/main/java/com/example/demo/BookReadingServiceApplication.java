package com.example.demo;

import java.net.URI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class BookReadingServiceApplication {

	@RequestMapping("/to-read")
	public String readingList() {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = URI.create("http://localhost:8090/recommended");

		return restTemplate.getForObject(uri, String.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BookReadingServiceApplication.class, args);
	}
}
