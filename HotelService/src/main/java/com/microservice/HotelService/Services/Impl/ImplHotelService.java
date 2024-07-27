package com.microservice.HotelService.Services.Impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.HotelService.Entities.Hotels;
import com.microservice.HotelService.Exceptions.ResourceNotFoundException;
import com.microservice.HotelService.Repositories.Hotelrepo;
import com.microservice.HotelService.Services.Hotelservice;

@Service
public class ImplHotelService implements Hotelservice{

	@Autowired
	private Hotelrepo _hotelrepo;
	
	@Override
	public Hotels AddHotel(Hotels hotel) {
		// TODO Auto-generated method stub
	hotel.setId(UUID.randomUUID().toString());
	return	_hotelrepo.save(hotel);
	}

	@Override
	public List<Hotels> getAll() {
		// TODO Auto-generated method stub
		return _hotelrepo.findAll();
	}

	@Override
	public Hotels getHotelbyId(String id) {
		// TODO Auto-generated method stub
		return _hotelrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel with the given ID not found"));
	}

}
