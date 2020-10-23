package com.hotelapp.service;
import java.util.*;

import com.hotelapp.model.Hotel;
public interface HotelService {
	List<Hotel> getAllHotels();
	List<Hotel> getByCity(String city);
	List<Hotel> getByCuisine(String cuisine);
	Hotel getById(int id);	

}
