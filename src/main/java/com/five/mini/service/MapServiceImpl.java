package com.five.mini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.five.mini.model.Restaurant;
import com.five.mini.repository.RestaurantRepository;

@Service
public class MapServiceImpl implements MapService {

	@Autowired
	RestaurantRepository restaurantRepository;
	
	@Override
	public List<Restaurant> getRestaurant() {
		return restaurantRepository.findAll();
	}
}