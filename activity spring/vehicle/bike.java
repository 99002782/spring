package com.lts.vechile;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Mile {

	@Override
	public void showMileage() {
		// TODO Auto-generated method stub
		
		System.out.println("Bike mileage is");
	}

}