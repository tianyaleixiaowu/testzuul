package com.tianyalei.testzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class TestzuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestzuulApplication.class, args);
	}
}
