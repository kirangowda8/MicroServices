package com.micro1service.rating.service;

import java.util.List;

import com.micro1service.rating.entity.Rating;

public interface RatingService {

	Rating giveRating(Rating rating);

	List<Rating> getAllRatings();

	List<Rating> getByUserId(String userId);

	List<Rating> getByHotelId(String hotelId);
}
