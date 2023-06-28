package com.butters.myeatslist.repository;

import com.butters.myeatslist.entity.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
