package com.butters.myeatslist.service;

import com.butters.myeatslist.entity.Restaurant;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {

    Restaurant saveRestaurant(Restaurant restaurant);
    List<Restaurant> getAllRestaurants();
    Optional<Restaurant> getRestaurant(Long id);
    void deleteRestaurant(Long id);
//    Optional<Restaurant> updateRestaurant(Long id, Restaurant restaurant);
}
