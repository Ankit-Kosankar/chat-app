package com.ankitkosankar.notificatioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NotificatioserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificatioserviceApplication.class, args);
	}

}
