package com.lts.vechile;

import org.springframework.stereotype.Component;

@Component
public class Car implements Mile{

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		System.out.println("car mileage is");
	}

}