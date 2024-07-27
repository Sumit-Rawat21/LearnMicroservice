package com.microservice.HotelService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.HotelService.Entities.Hotels;
import com.microservice.HotelService.Services.Hotelservice;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private Hotelservice _hotelservice;
	
	@PostMapping
	public ResponseEntity<Hotels> AddHotel(@RequestBody Hotels hotel)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(_hotelservice.AddHotel(hotel));
	}
	
	@GetMapping
	public ResponseEntity<List<Hotels>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(_hotelservice.getAll());
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<Hotels> getByID(@PathVariable String Id)
	{
		return ResponseEntity.status(HttpStatus.FOUND).body(_hotelservice.getHotelbyId(Id));
	}
}
