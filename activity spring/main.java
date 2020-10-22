package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.vechile.VechileDetails;

@SpringBootApplication
public class TrailApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TrailApplication.class, args);
		
	}
	@Autowired
	ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		VechileDetails vechileDetails=context.getBean(VechileDetails.class);
		vechileDetails.getMileage("car");
		vechileDetails.getMileage("bike");
	}

}