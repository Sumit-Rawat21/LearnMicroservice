package com.microservice.HotelService.Services;

import java.util.List;

import com.microservice.HotelService.Entities.Hotels;

public interface Hotelservice {

	//Adding a New Hotel
	Hotels AddHotel(Hotels hotel);
	
	//Get list of hotels
	List<Hotels> getAll();
	
	//Get hotel based on id
	Hotels getHotelbyId(String id);
	
}
