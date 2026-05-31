package com.campusdang.restauration.controller;

import com.campusdang.restauration.model.*;
import com.campusdang.restauration.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    private RestaurantService restaurantService;
    
    @Autowired
    private MenuService menuService;
    
    @Autowired
    private PlatMenuService platMenuService;
    
    // --- Dashboard ---
    @GetMapping
    public String dashboard(Model model) {
        model.addAttribute("titre", "Administration");
        model.addAttribute("restaurants", restaurantService.getRestaurantsActifs());
        model.addAttribute("totalRestaurants", restaurantService.getNombreRestaurants());
        return "admin/dashboard";
    }
    
    // --- Gestion des menus ---
    @GetMapping("/menus/{restaurantId}")
    public String listerMenus(@PathVariable Long restaurantId, Model model) {
        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
        model.addAttribute("titre", "Menus de " + restaurant.getNom());
        model.addAttribute("restaurant", restaurant);
        model.addAttribute("menus", menuService.getMenusDuJour(restaurantId, LocalDate.now()));
        return "admin/menus";
    }
    
    // --- Formulaire nouveau menu ---
    @GetMapping("/menus/nouveau/{restaurantId}")
    public String nouveauMenu(@PathVariable Long restaurantId, Model model) {
        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
        model.addAttribute("titre", "Nouveau menu pour " + restaurant.getNom());
        model.addAttribute("restaurant", restaurant);
        model.addAttribute("typesMenu", TypeMenu.values());
        return "admin/nouveauMenu";
    }
    
    // --- Enregistrer un nouveau menu ---
    @PostMapping("/menus/sauvegarder")
    public String sauvegarderMenu(
            @RequestParam Long restaurantId,
            @RequestParam String type,
            @RequestParam String date,
            Model model) {
        
        Restaurant restaurant = restaurantService.getRestaurantById(restaurantId);
        
        Menu menu = new Menu();
        menu.setType(TypeMenu.valueOf(type));
        menu.setDate(LocalDate.parse(date));
        menu.setDisponible(true);
        menu.setRestaurant(restaurant);
        
        menuService.saveMenu(menu);
        
        return "redirect:/admin/menus/" + restaurantId;
    }
    
    // --- Formulaire ajouter plat ---
    @GetMapping("/plats/nouveau/{menuId}")
    public String nouveauPlat(@PathVariable Long menuId, Model model) {
        Menu menu = menuService.getMenuById(menuId);
        model.addAttribute("titre", "Ajouter un plat");
        model.addAttribute("menu", menu);
        return "admin/nouveauPlat";
    }
    
    // --- Enregistrer un plat ---
    @PostMapping("/plats/sauvegarder")
    public String sauvegarderPlat(
            @RequestParam Long menuId,
            @RequestParam String nom,
            @RequestParam String description,
            @RequestParam Double prix,
            @RequestParam String categorie,
            Model model) {
        
        Menu menu = menuService.getMenuById(menuId);
        
        PlatMenu plat = new PlatMenu();
        plat.setNom(nom);
        plat.setDescription(description);
        plat.setPrix(prix);
        plat.setCategorie(categorie);
        plat.setDisponible(true);
        plat.setMenu(menu);
        
        platMenuService.savePlat(plat);
        
        return "redirect:/admin/menus/" + menu.getRestaurant().getId();
    }
}