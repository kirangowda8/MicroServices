package com.micro1service.rating.controller;

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

import com.micro1service.rating.entity.Rating;
import com.micro1service.rating.service.RatingService;

@RestController
@RequestMapping("/api/rating-service")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping("/save")
	public ResponseEntity<Rating> giveRating(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.giveRating(rating));
	}

	@GetMapping("/all")
	public List<Rating> getAll() {
		return ratingService.getAllRatings();
	}

	@GetMapping("/{userId}")
	public List<Rating> getByUsreId(@PathVariable String userId) {
		return ratingService.getByUserId(userId);

	}

	@GetMapping("/{hotelId}")
	public List<Rating> getByHotelId(@PathVariable String hotelId) {
		return ratingService.getByHotelId(hotelId);
	}
}
