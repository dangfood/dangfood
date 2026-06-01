package com.campusdang.restauration.service;

import com.campusdang.restauration.model.Menu;
import com.campusdang.restauration.model.TypeMenu;
import com.campusdang.restauration.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class MenuService {
    
    @Autowired
    private MenuRepository menuRepository;
    
    public List<Menu> getMenusDuJour(Long restaurantId, LocalDate date) {
        return menuRepository.findByRestaurantIdAndDateAndDisponibleTrue(restaurantId, date);
    }
    
    public Menu getMenuDuJour(Long restaurantId, LocalDate date, TypeMenu type) {
        return menuRepository.findByRestaurantIdAndDateAndType(restaurantId, date, type)
            .orElseThrow(() -> new RuntimeException("Menu non disponible pour ce restaurant et ce type"));
    }
    
    public Menu getMenuById(Long id) {
        return menuRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Menu non trouvé avec l'id: " + id));
    }
    
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }
}