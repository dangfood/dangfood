package com.campusdang.restauration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "plats_menu")
public class PlatMenu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nom;
    
    @Column(length = 500)
    private String description;
    
    @Column(nullable = false)
    private Double prix;
    
    private String categorie;
    private String imageUrl;
    private Boolean disponible = true;
    private String ingredients;
    private Integer tempsPreparation;
    private Boolean vegetarien = false;
    private Boolean epice = false;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;
    
    // Constructeurs
    public PlatMenu() {}
    
    public PlatMenu(String nom, String description, Double prix, String categorie, Menu menu) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.categorie = categorie;
        this.menu = menu;
    }
    
    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public Double getPrix() { return prix; }
    public void setPrix(Double prix) { this.prix = prix; }
    
    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }
    
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    
    public Boolean getDisponible() { return disponible; }
    public void setDisponible(Boolean disponible) { this.disponible = disponible; }
    
    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    
    public Integer getTempsPreparation() { return tempsPreparation; }
    public void setTempsPreparation(Integer tempsPreparation) { this.tempsPreparation = tempsPreparation; }
    
    public Boolean getVegetarien() { return vegetarien; }
    public void setVegetarien(Boolean vegetarien) { this.vegetarien = vegetarien; }
    
    public Boolean getEpice() { return epice; }
    public void setEpice(Boolean epice) { this.epice = epice; }
    
    public Menu getMenu() { return menu; }
    public void setMenu(Menu menu) { this.menu = menu; }
}