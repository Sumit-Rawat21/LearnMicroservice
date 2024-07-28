package com.MicroService.RatingService.RatingService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.MicroService.RatingService.Entities.Ratings;
import com.MicroService.RatingService.Repository.Repo;

@org.springframework.stereotype.Service
public class RatingServiceImpl implements Service{

   @Autowired
   private Repo _ratingRepo;
	
	@Override
	public Ratings add(Ratings rating) {
		// TODO Auto-generated method stub
		rating.setId(UUID.randomUUID().toString());
		return _ratingRepo.save(rating);
	}

	@Override
	public List<Ratings> getAll() {
		// TODO Auto-generated method stub
		return _ratingRepo.findAll();
	}

	@Override
	public Ratings getbyUserId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ratings getbyHotelId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
