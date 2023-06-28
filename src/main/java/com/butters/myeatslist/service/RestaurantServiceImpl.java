package com.butters.myeatslist.service;

import com.butters.myeatslist.entity.Restaurant;
import com.butters.myeatslist.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return (List<Restaurant>) restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> getRestaurant(Long id) {
        return restaurantRepository.findById(id);
    }

    @Override
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }

//    @Override
//    public Optional<Restaurant> updateRestaurant(Long id, Restaurant restaurant) {
//        Optional<Restaurant> oldScore = restaurantRepository.findById(id);
//        return oldScore;
//    }
}
