package com.SpringRestMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestMongoDB.Controller.CustomerController;
import com.SpringRestMongoDB.model.Customer;
import com.SpringRestMongoDB.repo.CustomerRepository;


@SpringBootApplication
//@ComponentScan({"com.SpringRestMongoDB.Client"})
public class SpringRestMongoDbApplication 
//implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMongoDbApplication.class, args);

		
	}


}
