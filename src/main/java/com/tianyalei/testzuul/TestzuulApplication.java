package com.tianyalei.testzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class TestzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestzuulApplication.class, args);
	}
}
