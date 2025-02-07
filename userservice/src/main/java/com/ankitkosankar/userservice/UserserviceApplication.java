package com.ankitkosankar.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class UserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserserviceApplication.class, args);
	}

	
	
	
	
	

//	@PostConstruct
//	public void checkDriver() {
//	    try {
//	        Driver driver = DriverManager.getDriver("jdbc:postgresql://localhost:5432/user_service_db");
//	        System.out.println("PostgreSQL Driver loaded: " + driver.getClass().getName());
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    }
//	}
//	
//	@PostConstruct
//	public void init() throws ClassNotFoundException {
//	    // Explicitly load the PostgreSQL driver
//	    Class.forName("org.postgresql.Driver");
//	}

	
	
}
