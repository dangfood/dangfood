package com.campusdang.restauration.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menus")
public class Menu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeMenu type;
    
    @Column(nullable = false)
    private LocalDate date;
    
    private Boolean disponible = true;
    
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
    
    @OneToMany(mappedBy = "menu")
    private List<PlatMenu> plats = new ArrayList<>();
    
    // Constructeurs
    public Menu() {}
    
    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public TypeMenu getType() { return type; }
    public void setType(TypeMenu type) { this.type = type; }
    
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
    
    public Boolean getDisponible() { return disponible; }
    public void setDisponible(Boolean disponible) { this.disponible = disponible; }
    
    public Restaurant getRestaurant() { return restaurant; }
    public void setRestaurant(Restaurant restaurant) { this.restaurant = restaurant; }
    
    public List<PlatMenu> getPlats() { return plats; }
    public void setPlats(List<PlatMenu> plats) { this.plats = plats; }
}