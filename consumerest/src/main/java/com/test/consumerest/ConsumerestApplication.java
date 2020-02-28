package com.test.consumerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerestApplication {

	// to consume a rest api you use a rest Template.Rest Template will be deprecated because its blocking
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public static void main(final String[] args) {
		SpringApplication.run(ConsumerestApplication.class, args);
	}

}
