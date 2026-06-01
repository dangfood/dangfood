package com.campusdang.restauration.service;

import com.campusdang.restauration.model.Restaurant;
import com.campusdang.restauration.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    
    @Autowired
    private RestaurantRepository restaurantRepository;
    
    public List<Restaurant> getRestaurantsActifs() {
        return restaurantRepository.findByActifTrue();
    }
    
    public Restaurant getRestaurantById(Long id) {
        Optional<Restaurant> restaurant = restaurantRepository.findById(id);
        return restaurant.orElseThrow(() -> new RuntimeException("Restaurant non trouvé avec l'id: " + id));
    }
    
    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
    
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }
    
    public long getNombreRestaurants() {
        return restaurantRepository.count();
    }
    
    public List<Restaurant> searchRestaurants(String query) {
        return restaurantRepository.findByNomContainingIgnoreCase(query);
    }
}