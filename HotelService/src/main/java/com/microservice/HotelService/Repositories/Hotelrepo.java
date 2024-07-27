package com.microservice.HotelService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.HotelService.Entities.Hotels;

public interface Hotelrepo extends JpaRepository<Hotels, String> {

}
