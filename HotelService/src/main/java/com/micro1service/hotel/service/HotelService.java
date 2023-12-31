package com.micro1service.hotel.service;

import java.util.List;

import com.micro1service.hotel.entity.Hotel;
import com.micro1service.hotel.exception.ResoureceNoFoundException;

public interface HotelService {
	
	Hotel createHotel(Hotel hotel);
	
	
	List<Hotel> getAllHotels();
	
	Hotel getByHotelId(String id)throws ResoureceNoFoundException;
	
	Hotel update(String id, Hotel hotel)throws ResoureceNoFoundException;
	
	String DeleteHotel(String id)throws ResoureceNoFoundException;
}
