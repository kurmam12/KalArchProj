package com.cog.pract.payment.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ExternalSericeCaller {
	private final RestTemplate restTemplate = new RestTemplate();
    private static final String SERVICE_NAME = "externalService";

    @CircuitBreaker(name = SERVICE_NAME, fallbackMethod = "fallbackForExternalService")
    public String callExternalService() {
        System.out.println("Attempting to call external service...");
        
        // This is the call that might fail (e.g., network error, timeout, 5xx status)
        String result = restTemplate.getForObject("http://localhost:8081/api/data", String.class);
        
        System.out.println("External service call successful.");
        return "Success: " + result;
    }

    /**
     * The fallback method must have the same return type and arguments 
     * as the original method, PLUS an optional Throwable/Exception parameter.
     */
    private String fallbackForExternalService(Throwable t) {
        System.out.println("Fallback executed due to error: " + t.getMessage());
        
        // Log the error and return a safe, default response
        return "Fallback Response: The external service is currently unavailable.";
    }
}