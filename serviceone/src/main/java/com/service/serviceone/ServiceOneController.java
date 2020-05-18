package com.service.serviceone;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.model.NumberModel;
import com.service.model.Output;



@RestController
public class ServiceOneController {
	@Autowired
	ServiceOneService externalService;
	
	/*@RequestMapping(value="/addition",method=RequestMethod.POST)
	public Output addEc(@RequestBody NumberModel numberModel) throws  IOException  {
		
		HttpHeaders headers = new HttpHeaders();		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<NumberModel> entity = new HttpEntity<NumberModel>(numberModel, headers);		
		return externalService.addEs(numberModel,entity);
		
	}*/
	@RequestMapping(value="/addition",method=RequestMethod.POST)
	public Output addEc(@RequestBody NumberModel numberModel) throws  IOException  {
		
			
		return externalService.addEs(numberModel);
		
	}
}
