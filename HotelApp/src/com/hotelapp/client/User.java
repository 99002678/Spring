package com.hotelapp.client;

import java.util.List;

import com.hotelapp.model.Hotel;
import com.hotelapp.sevice.HotelService;
import com.hotelapp.sevice.HotelServiceImpl;

public class User {
	public static void main(String[] args) {
		HotelService hotelService = new HotelServiceImpl();
		List<Hotel> hotelList = hotelService.getAllHotels();
		for(Hotel hotel : hotelList)
			System.out.println(hotel);
		//List<Hotel> hotelList1 = hotelService.getById(11);
		
	}
}
