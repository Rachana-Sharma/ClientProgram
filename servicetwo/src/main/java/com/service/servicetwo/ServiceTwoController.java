package com.service.servicetwo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.model.NumberModel;
import com.service.model.Output;

@RestController
public class ServiceTwoController {
	
	@Autowired
	ServiceTwoService firstInternalService;
	
	NumberModel firstModel = new NumberModel();
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Output addIc(@RequestBody NumberModel firstModel) {		
		return firstInternalService.add(firstModel);
	}

}
