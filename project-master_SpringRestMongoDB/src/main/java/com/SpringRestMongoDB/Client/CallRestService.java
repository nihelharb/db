package com.SpringRestMongoDB.Client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.SpringRestMongoDB.model.Customer;

@Component
public class CallRestService implements CommandLineRunner{

	/* private static void callRestService() {
		 RestTemplate restTemplate = new RestTemplate() ;
	     Customer customer =  restTemplate.getForObject("http://localhost:8080/api/customers/age/22.json", Customer.class);
         System.out.println("nom : "+ customer.getName());
	 }
*/
	@Override
	public void run(String... args) throws Exception {
//		callRestService();		
	}
}
