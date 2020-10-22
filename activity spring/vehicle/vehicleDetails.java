package com.lts.vechile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class VechileDetails {

	@Autowired
	@Qualifier("car")
	MileCalc car;
	@Autowired
	@Qualifier("bike")
	MileCalc bike;
	public void getMileage(String choice) {
		if(choice.equals("car"))
			car.showMileage(20);
		else
			bike.showMileage(40);
	}
	
	}
