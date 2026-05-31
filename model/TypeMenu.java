package com.campusdang.restauration.model;

public enum TypeMenu {
    PETIT_DEJEUNER("Petit Déjeuner", "🌅"),
    DEJEUNER("Déjeuner", "☀️"),
    DINER("Dîner", "🌙");

    private final String libelle;
    private final String emoji;

    TypeMenu(String libelle, String emoji) {
        this.libelle = libelle;
        this.emoji = emoji;
    }

    public String getLibelle() { return libelle; }
    public String getEmoji() { return emoji; }
}