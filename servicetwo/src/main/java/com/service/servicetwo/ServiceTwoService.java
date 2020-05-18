package com.service.servicetwo;

import org.springframework.stereotype.Service;

import com.service.model.NumberModel;
import com.service.model.Output;


@Service
public class ServiceTwoService {
	
	Output output = new Output();
	public Output add(NumberModel firstModel) {
		int number1 = firstModel.getNumber1();
		int number2 = firstModel.getNumber2();
		//return number1 + number2;
		int number3 = number1 + number2;
		 output.setResult(number3);
		return output;
		}

}
