package com.butters.myeatslist.controller;

import com.butters.myeatslist.entity.Restaurant;
import com.butters.myeatslist.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurant")
@CrossOrigin
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/add")
    public String saveRestaurant(@RequestBody @Valid Restaurant restaurant) {
        restaurantService.saveRestaurant(restaurant);
        return "Restaurant has been saved";
    }

    @GetMapping("/getAll")
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/get/{id}")
    public Optional<Restaurant> getRestaurant(@PathVariable Long id) {
        return restaurantService.getRestaurant(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }
}
