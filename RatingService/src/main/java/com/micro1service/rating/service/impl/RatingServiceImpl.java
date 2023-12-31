package com.micro1service.rating.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro1service.rating.entity.Rating;
import com.micro1service.rating.repository.RatingRepository;
import com.micro1service.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating giveRating(Rating rating) {
		rating.setId(UUID.randomUUID().toString());
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getByUserId(String userId) {
		List<Rating> ratings = ratingRepository.findByUserId(userId);
		return ratings;
	}

	@Override
	public List<Rating> getByHotelId(String hotelId) {
		List<Rating> ratings = ratingRepository.findByHotelId(hotelId);
		return ratings;
	}

}
