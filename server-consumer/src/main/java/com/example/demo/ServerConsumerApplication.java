package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableCircuitBreaker
public class ServerConsumerApplication {
	/*
	 *http://localhost:9092/hystrix/actuator/hystrix.stream
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ServerConsumerApplication.class, args);
	}

}
