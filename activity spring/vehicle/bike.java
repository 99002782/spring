package com.lts.vechile;

import org.springframework.stereotype.Component;

@Component
public class Bike implements MileCalc {

	@Override
	public void showMileage(int x) {
		// TODO Auto-generated method stub
		System.out.println("car mileage"+x);
	}

}
