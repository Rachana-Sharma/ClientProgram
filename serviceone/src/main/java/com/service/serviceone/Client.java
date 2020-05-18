package com.service.serviceone;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.service.model.NumberModel;
import com.service.model.Output;

public class Client {
	@Autowired
	private RestTemplate  restTemplate;


public Output client(NumberModel numberModel) throws  IOException  {
		
	HttpHeaders headers = new HttpHeaders();		
	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	HttpEntity<NumberModel> entity = new HttpEntity<NumberModel>(numberModel, headers);
		Output result = restTemplate.exchange("http://localhost:8084/add",HttpMethod.POST,entity,Output.class).getBody();
		
		return result;
	
		
		
	}
}
