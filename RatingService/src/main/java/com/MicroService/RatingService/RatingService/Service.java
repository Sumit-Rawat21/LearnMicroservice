package com.MicroService.RatingService.RatingService;

import java.util.List;

import com.MicroService.RatingService.Entities.Ratings;

public interface Service{
	
	public Ratings add(Ratings rating);
	
	public List<Ratings> getAll();
	
	public Ratings getbyUserId(String id);
	
	public Ratings getbyHotelId(String id);
	
}
