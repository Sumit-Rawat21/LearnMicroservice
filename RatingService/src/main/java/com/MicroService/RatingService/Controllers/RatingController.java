package com.MicroService.RatingService.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MicroService.RatingService.Entities.Ratings;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	private com.MicroService.RatingService.RatingService.Service _ratingService;
	
	@PostMapping
	public ResponseEntity<Ratings> submitRating(@RequestBody Ratings rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(_ratingService.add(rating));
	}
	
	
	@GetMapping
	public ResponseEntity<List<Ratings>> getALLRatings() {
		return ResponseEntity.status(HttpStatus.OK).body(_ratingService.getAll());
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Ratings> getRatingsByuserID(String userId) {
		return ResponseEntity.status(HttpStatus.OK).body(_ratingService.getbyUserId(userId));
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Ratings> getRatingsByhotelId(String hotelId) {
		return ResponseEntity.status(HttpStatus.OK).body(_ratingService.getbyHotelId(hotelId));
	}
}
