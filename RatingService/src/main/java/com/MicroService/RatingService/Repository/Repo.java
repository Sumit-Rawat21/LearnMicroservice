package com.MicroService.RatingService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MicroService.RatingService.Entities.Ratings;

public interface Repo extends JpaRepository<Ratings, String> {
	
	List<Ratings> findByUserId(String userId);
	List<Ratings> findByHotelId(String hotelId);
}
