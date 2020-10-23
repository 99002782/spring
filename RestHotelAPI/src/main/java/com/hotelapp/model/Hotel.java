package com.hotelapp.model;

public class Hotel {

	String HotelName;
	Integer hotelId;
	String city;
	String Cuisine;
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCuisine() {
		return Cuisine;
	}
	public void setCuisine(String cuisine) {
		Cuisine = cuisine;
	}
	public Hotel(String hotelName, Integer hotelId, String city, String cuisine) {
		super();
		HotelName = hotelName;
		this.hotelId = hotelId;
		this.city = city;
		Cuisine = cuisine;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", hotelId=" + hotelId + ", city=" + city + ", Cuisine=" + Cuisine
				+ "]";
	}
	
	
}
