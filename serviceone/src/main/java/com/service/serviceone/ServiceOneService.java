package com.service.serviceone;

import java.io.IOException;
import java.util.Arrays;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.service.model.NumberModel;
import com.service.model.Output;

@Service
public class ServiceOneService {

	@Autowired
	private RestTemplate  restTemplate;
	
	@Autowired
	Client client;

	/*public Output addEs(NumberModel firstModel, HttpEntity<NumberModel> entity) throws IOException {
	
		Output result = restTemplate.exchange("http://localhost:8084/add",HttpMethod.POST,entity,Output.class).getBody();
		return result;
		
	}*/
	
	public Output addEs(NumberModel numberModel) throws IOException {
		/*HttpHeaders headers = new HttpHeaders();		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<NumberModel> entity = new HttpEntity<NumberModel>(numberModel, headers);*/
		return client.client(numberModel);
		
	}
}
