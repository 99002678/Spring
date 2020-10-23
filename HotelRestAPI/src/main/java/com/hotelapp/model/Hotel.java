package com.hotelapp.model;

public class Hotel {
	String hotelName;
	Integer hotelId;
	String city;
	String cuisine;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public Hotel(String hotelName, Integer hotelId, String city, String cuisine) {
		super();
		this.hotelName = hotelName;
		this.hotelId = hotelId;
		this.city = city;
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", hotelId=" + hotelId + ", city=" + city + ", cuisine=" + cuisine
				+ ", getHotelName()=" + getHotelName() + ", getHotelId()=" + getHotelId() + ", getCity()=" + getCity()
				+ ", getCuisine()=" + getCuisine() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Hotel() {
		super();
	}
	
}
