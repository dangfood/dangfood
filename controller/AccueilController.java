package com.campusdang.restauration.controller;

import com.campusdang.restauration.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {
    
    @Autowired
    private RestaurantService restaurantService;
    
    @GetMapping("/")
    public String accueil(Model model) {
        model.addAttribute("titre", "Campus Dang Food");
        model.addAttribute("restaurants", restaurantService.getRestaurantsActifs());
        model.addAttribute("totalRestaurants", restaurantService.getNombreRestaurants());
        return "accueil/index";
    }
    
    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("titre", "Contact");
        return "contact";
    }
}
