package com.campusdang.restauration.controller;

import com.campusdang.restauration.model.Restaurant;
import com.campusdang.restauration.model.TypeMenu;
import com.campusdang.restauration.service.MenuService;
import com.campusdang.restauration.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {
    
    @Autowired
    private RestaurantService restaurantService;
    
    @Autowired
    private MenuService menuService;
    
    @GetMapping
    public String liste(Model model) {
        model.addAttribute("titre", "Nos Restaurants");
        model.addAttribute("restaurants", restaurantService.getRestaurantsActifs());
        return "restaurants/liste";
    }
    
    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        model.addAttribute("titre", restaurant.getNom());
        model.addAttribute("restaurant", restaurant);
        model.addAttribute("menusDuJour", menuService.getMenusDuJour(id, LocalDate.now()));
        model.addAttribute("typesMenu", TypeMenu.values());
        return "restaurants/detail";
    }
    
    @GetMapping("/{id}/menu/{type}")
    public String voirMenu(@PathVariable Long id, @PathVariable String type, Model model) {
        TypeMenu typeMenu = TypeMenu.valueOf(type.toUpperCase());
        Restaurant restaurant = restaurantService.getRestaurantById(id);
        model.addAttribute("titre", restaurant.getNom() + " - " + typeMenu.getLibelle());
        model.addAttribute("menu", menuService.getMenuDuJour(id, LocalDate.now(), typeMenu));
        model.addAttribute("restaurant", restaurant);
        return "restaurants/menu";
    }
}  // ✅ Ne pas oublier cette accolade fermante