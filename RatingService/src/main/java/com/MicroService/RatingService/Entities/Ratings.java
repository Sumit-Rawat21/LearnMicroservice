package com.MicroService.RatingService.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ratings {
	@Id
	private String id;
	private String userId;
	private String hotelId;
	private int Ratings;
	private String feedback;
	

}
