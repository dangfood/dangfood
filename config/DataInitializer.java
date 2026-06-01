package com.campusdang.restauration.config;

import com.campusdang.restauration.model.*;
import com.campusdang.restauration.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {
    
    @Autowired private RestaurantRepository restaurantRepo;
    @Autowired private MenuRepository menuRepo;
    @Autowired private PlatMenuRepository platMenuRepo;
    @Autowired private ClientRepository clientRepo;
    @Autowired private UtilisateurRepository utilisateurRepo;
    @Autowired private org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;
    
    @Override
    public void run(String... args) {
        // --- CLIENTS ---
        if (!clientRepo.existsByEmail("jean@email.com")) {
            Client client = new Client();
            client.setNom("Jean Dupont");
            client.setEmail("jean@email.com");
            client.setTelephone("+237 6 90 12 34 56");
            client.setMotDePasse("123456");
            clientRepo.save(client);
            System.out.println("✅ Client créé : Jean Dupont");
        } else {
            System.out.println("ℹ️ Client déjà existant : Jean Dupont");
        }
        
        // --- RESTAURANTS ---
        if (restaurantRepo.count() == 0) {
            // Restaurant 1 : Grillade du Campus
            Restaurant resto1 = new Restaurant();
            resto1.setNom("Grillade du Campus");
            resto1.setAdresse("Face campus de Dang, côté nord");
            resto1.setTelephone("+237 6 90 12 34 56");
            resto1.setTypeService(TypeService.GRILLADE);
            resto1.setDescription("Spécialités de grillades et brochettes. Viande de qualité.");
            resto1.setHorairesOuverture("6h - 22h");
            resto1.setSpecialite("Brochettes de bœuf");
            resto1.setNote(4.5);
            resto1.setNombreAvis(120);
            resto1 = restaurantRepo.save(resto1);
            
            // Restaurant 2 : Restaurant Le Dangois
            Restaurant resto2 = new Restaurant();
            resto2.setNom("Restaurant Le Dangois");
            resto2.setAdresse("Avenue principale, 200m du campus");
            resto2.setTelephone("+237 6 91 23 45 67");
            resto2.setTypeService(TypeService.RESTAURANT);
            resto2.setDescription("Cuisine traditionnelle camerounaise et internationale.");
            resto2.setHorairesOuverture("7h - 23h");
            resto2.setSpecialite("Poulet DG");
            resto2.setNote(4.8);
            resto2.setNombreAvis(200);
            resto2 = restaurantRepo.save(resto2);
            
            // Restaurant 3 : Bar Lounge Campus
            Restaurant resto3 = new Restaurant();
            resto3.setNom("Bar Lounge Campus");
            resto3.setAdresse("Cité Campus, Bâtiment B");
            resto3.setTelephone("+237 6 92 34 56 78");
            resto3.setTypeService(TypeService.BAR);
            resto3.setDescription("Bar ambiance avec petite restauration et cocktails.");
            resto3.setHorairesOuverture("8h - 00h");
            resto3.setSpecialite("Cocktails maison");
            resto3.setNote(4.2);
            resto3.setNombreAvis(85);
            resto3 = restaurantRepo.save(resto3);
            
            // Créer les menus du jour pour chaque restaurant
            creerMenusPourRestaurant(resto1);
            creerMenusPourRestaurant(resto2);
            creerMenusPourRestaurant(resto3);
            
            System.out.println("✅ Données initiales créées avec succès !");
            System.out.println("📊 " + restaurantRepo.count() + " restaurants créés");
            System.out.println("📋 " + menuRepo.count() + " menus créés");
            System.out.println("🍽️  " + platMenuRepo.count() + " plats créés");
        } else {
            System.out.println("ℹ️ Les restaurants existent déjà, pas de réinsertion.");
        }
        
        // --- UTILISATEURS (Chef et Serveur) ---
        if (!utilisateurRepo.existsByEmail("chef@campusdang.cm")) {
            Utilisateur chef = new Utilisateur();
            chef.setEmail("chef@campusdang.cm");
            chef.setMotDePasse(passwordEncoder.encode("chef123")); // ✅ Encodé                  //---------------
            chef.setNom("Chef Cuisinier");
            chef.setRole(Role.CHEF);
            chef.setActif(true);
            utilisateurRepo.save(chef);
            System.out.println("✅ Chef créé : chef@campusdang.cm");
        }

        if (!utilisateurRepo.existsByEmail("serveur@campusdang.cm")) {
            Utilisateur serveur = new Utilisateur();
            serveur.setEmail("serveur@campusdang.cm");
            serveur.setMotDePasse(passwordEncoder.encode("serveur123")); // ✅ Encodé
            serveur.setNom("Serveur");
            serveur.setRole(Role.SERVEUR);
            serveur.setActif(true);
            utilisateurRepo.save(serveur);
            System.out.println("✅ Serveur créé : serveur@campusdang.cm");
        }
    }
    
    // ⚠️ CETTE MÉTHODE DOIT ÊTRE EN DEHORS DE run()
    private void creerMenusPourRestaurant(Restaurant restaurant) {
        // Menu Déjeuner
        Menu dejeuner = new Menu();
        dejeuner.setType(TypeMenu.DEJEUNER);
        dejeuner.setDate(LocalDate.now());
        dejeuner.setDisponible(true);
        dejeuner.setRestaurant(restaurant);
        dejeuner = menuRepo.save(dejeuner);
        
        ajouterPlat(dejeuner, "Poulet DG", "Poulet braisé aux plantains", 3500.0, "plat_principal");
        ajouterPlat(dejeuner, "Salade composée", "Salade fraîche avec poulet", 2000.0, "entree");
        ajouterPlat(dejeuner, "Jus de gingembre", "Jus naturel maison", 1000.0, "boisson");
        ajouterPlat(dejeuner, "Gâteau au chocolat", "Dessert maison", 1500.0, "dessert");
        
        // Menu Dîner
        Menu diner = new Menu();
        diner.setType(TypeMenu.DINER);
        diner.setDate(LocalDate.now());
        diner.setDisponible(true);
        diner.setRestaurant(restaurant);
        diner = menuRepo.save(diner);
        
        ajouterPlat(diner, "Poisson braisé", "Poisson frais avec légumes", 4000.0, "plat_principal");
        ajouterPlat(diner, "Brochettes de bœuf", "Brochettes marinées", 3000.0, "plat_principal");
        ajouterPlat(diner, "Jus d'ananas", "Jus pressé artisanal", 1200.0, "boisson");
        ajouterPlat(diner, "Tiramisu", "Dessert italien maison", 2000.0, "dessert");
        
        // Menu Petit Déjeuner
        Menu petitDej = new Menu();
        petitDej.setType(TypeMenu.PETIT_DEJEUNER);
        petitDej.setDate(LocalDate.now());
        petitDej.setDisponible(true);
        petitDej.setRestaurant(restaurant);
        petitDej = menuRepo.save(petitDej);
        
        ajouterPlat(petitDej, "Café + Croissant", "Café avec croissant beurre", 1500.0, "boisson");
        ajouterPlat(petitDej, "Omelette", "Omelette aux légumes", 2000.0, "plat_principal");
        ajouterPlat(petitDej, "Jus d'orange", "Jus d'orange pressé", 1000.0, "boisson");
    }
    
    private void ajouterPlat(Menu menu, String nom, String description, Double prix, String categorie) {
        PlatMenu plat = new PlatMenu();
        plat.setNom(nom);
        plat.setDescription(description);
        plat.setPrix(prix);
        plat.setCategorie(categorie);
        plat.setDisponible(true);
        plat.setMenu(menu);
        platMenuRepo.save(plat);
    }
}