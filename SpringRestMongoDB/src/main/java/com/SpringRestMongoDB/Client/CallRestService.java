package com.SpringRestMongoDB.Client;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.text.html.parser.DTD;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.aggregation.VariableOperators.Map;
import org.springframework.data.mongodb.core.geo.GeoJson;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.SpringRestMongoDB.model.Customer;

@Component
public class CallRestService implements CommandLineRunner{

	private static void callRestService() {
	 /*   String url = "http://localhost:8080/api/customers/age/22";
	  // String sort = "22" ;
		 RestTemplate restTemplate = new RestTemplate() ;
		List<Customer> customer = (List<Customer>) restTemplate.getForObject("http://localhost:8080/api/customers/age/22", Customer.class);
     //    System.out.println("nom : "+ customer.getName());

		*/
	}

	@Override
	public void run(String... args) throws Exception {
		callRestService();		
	}
}

