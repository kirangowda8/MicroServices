package com.micro1service.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Hotels")
public class Hotel {

	@Id
	private String hotelId;
	
	private String name;
	
	private String location;
	
	private String about;
}
