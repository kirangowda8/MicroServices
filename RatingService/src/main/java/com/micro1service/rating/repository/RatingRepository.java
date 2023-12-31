package com.micro1service.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro1service.rating.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {
	List<Rating> findByUserId(String id);

	List<Rating> findByHotelId(String hotelId);
}
