package com.SpringRestMongoDB;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
//@ComponentScan({"com.SpringRestMongoDB.Client"})

public class SpringRestMongoDbApplication 
//implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMongoDbApplication.class, args);

		
	}


}
