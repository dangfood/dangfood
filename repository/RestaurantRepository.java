package com.campusdang.restauration.repository;

import com.campusdang.restauration.model.Restaurant;
import com.campusdang.restauration.model.TypeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    
    List<Restaurant> findByActifTrue();
    
    List<Restaurant> findByTypeService(TypeService typeService);
    
    List<Restaurant> findByNomContainingIgnoreCase(String nom);
}