package com.campusdang.restauration.model;

public enum TypeService {
    GRILLADE("Grillade", "🥩"),
    BAR("Bar", "🍺"),
    RESTAURANT("Restaurant", "🍽️");

    private final String libelle;
    private final String emoji;

    TypeService(String libelle, String emoji) {
        this.libelle = libelle;
        this.emoji = emoji;
    }

    public String getLibelle() { return libelle; }
    public String getEmoji() { return emoji; }
}