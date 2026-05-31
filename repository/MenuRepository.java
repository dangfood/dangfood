package com.campusdang.restauration.repository;

import com.campusdang.restauration.model.Menu;
import com.campusdang.restauration.model.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    
    List<Menu> findByRestaurantIdAndDateAndDisponibleTrue(Long restaurantId, LocalDate date);
    
    Optional<Menu> findByRestaurantIdAndDateAndType(Long restaurantId, LocalDate date, TypeMenu type);
    
    List<Menu> findByDateAndDisponibleTrue(LocalDate date);
}