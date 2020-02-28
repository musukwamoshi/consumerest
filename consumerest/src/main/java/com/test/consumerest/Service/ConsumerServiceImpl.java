package com.test.consumerest.Service;

import com.test.consumerest.Models.QuoteDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${resource.quote}")
    private String resource;
    
    public QuoteDTO getQuote() {
        return restTemplate.getForObject(resource, QuoteDTO.class);
    }
}