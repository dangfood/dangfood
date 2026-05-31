```markdown
<div align="center">
  
  <img src="https://img.icons8.com/color/96/000000/restaurant.png" alt="Logo" width="80"/>
  
  #  Campus Dang Food
  
  ### *Plateforme de Restauration & Réservation – Cœur du Cameroun*
  
  [![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java)](https://adoptium.net/)
  [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-6DB33F?style=for-the-badge&logo=springboot)](https://spring.io/projects/spring-boot)
  [![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql)](https://mysql.com)
  [![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-005F0F?style=for-the-badge&logo=thymeleaf)](https://www.thymeleaf.org/)
  [![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)
  
  > *Une expérience gastronomique haut de gamme alliant tradition camerounaise et innovation technologique.*
  
  [🚀 Démo en ligne](#) · [📖 Documentation](#) · [🐛 Signaler un bug](#) · [✨ Suggérer une idée](#)
  
</div>

---

## 📋 Table des matières

1. [Aperçu du projet](#-aperçu-du-projet)
2.  [Fonctionnalités principales](#-fonctionnalités-principales)
3.  [Stack technique](#-stack-technique)
4.  [Architecture & Structure](#-architecture--structure)
5.  [Installation & Configuration](#-installation--configuration)
6.  [Variables d'environnement](#-variables-denvironnement)
7.  [Démarrage rapide](#-démarrage-rapide)
8.  [Comptes par défaut](#-comptes-par-défaut)
9.  [API & Endpoints clés](#-api--endpoints-clés)
10. [Captures d'écran](#-captures-décran)
11. [Feuille de route](#-feuille-de-route)
12. [Contribution](#-contribution)
13. [Licence](#-licence)

---

## 🚀 Aperçu du projet

**Campus Dang Food** est une application web complète de gestion de restauration destinée aux établissements situés autour du campus universitaire. Elle permet aux clients de :

- Parcourir les restaurants (Grillade, Bar Lounge, Gastronomique).
- Consulter les menus du jour (Petit-déjeuner, Déjeuner, Dîner).
- Passer des commandes en ligne avec paiement sécurisé (simulation).
- Réserver des tables via un système interactif de choix de tables.
- Gérer l’administration des menus et plats (rôles CHEF / SERVEUR).

L’application allie un **back-end robuste** (Spring Boot, Security, JPA) et un **front-end moderne** (Thymeleaf, animations CSS, interface responsive).

---

## ✨ Fonctionnalités principales

### Côté Client 👤

| Module | Description |
|--------|-------------|
| 🏠 **Accueil dynamique** | Présentation des restaurants, statistiques, animations particules. |
| 🍽️ **Exploration restaurants** | Filtrage par type (grillade, bar, restaurant). |
| 📋 **Menus détaillés** | Affichage des plats par catégorie (traditionnel, moderne, dessert, boisson). |
| 🛒 **Panier & commande** | Ajout/suppression, calcul automatique, validation de commande. |
| 💳 **Paiement simulé** | MTN Mobile Money, Orange Money, VISA (mode démo). |
| 📅 **Réservation tables** | Sélection restaurant → formulaire → choix table en temps réel. |
| 📄 **Reçu PDF** | Génération d’un ticket de réservation / commande imprimable. |

### Côté Administration 🔐

| Rôle | Accès |
|------|-------|
| **CHEF** | Gestion complète des menus, création/suppression de plats, dashboard. |
| **SERVEUR** | Consultation des commandes, mise à jour statut (via console). |
| **Sécurité** | Spring Security, mots de passe BCrypt, sessions personnalisées. |

### Fonctionnalités transverses 🌐

- Design **dark mode premium** (effets or, particules flottantes, animations).
- **100% responsive** (mobile, tablette, desktop).
- Stockage local des commandes et statistiques (LocalStorage).
- Filtrage en temps réel des plats par catégorie.
- Notification toast pour les actions utilisateur.

---

## 🧰 Stack technique

### Backend
| Technologie | Version | Rôle |
|-------------|---------|------|
| Java JDK | 17 | Langage principal |
| Spring Boot | 3.2.0 | Framework MVC & IoC |
| Spring Security | 6.x | Authentification, autorisations |
| Spring Data JPA | 3.x | ORM, repositories |
| MySQL Connector | 8.x | Driver base de données |
| H2 Database | (runtime) | Tests & développement rapide |
| Maven | 3.9+ | Gestionnaire de dépendances |

### Frontend
| Technologie | Usage |
|-------------|-------|
| Thymeleaf 3.1 | Templates HTML dynamiques |
| HTML5 / CSS3 | Structure & animations personnalisées |
| JavaScript (ES6) | Panier, filtres, modales, LocalStorage |
| html2pdf.js | Génération de reçus PDF |
| Font Awesome 6 | Icônes vectorielles |
| Google Fonts | Playfair Display + Inter |

### Outils & Bonnes pratiques
- **Lombok** → Réduction boilerplate code.
- **DevTools** → Rechargement automatique.
- **Validation** → `@NotNull`, `@Email`, etc.
- **JUnit 5** → Tests unitaires.
- **Maven Wrapper** → Build sans installation préalable.

---

## 🏗 Architecture & Structure

```
com.campusdang.restauration
├── config
│   ├── DataInitializer.java       # Charge les données de démo
│   ├── SecurityConfig.java        # Configuration Spring Security
│   └── CustomUserDetailsService.java
├── controller
│   ├── AccueilController.java
│   ├── AdminController.java       # Gestion menus/plats
│   ├── LoginController.java
│   ├── ReservationController.java
│   └── RestaurantController.java
├── model
│   ├── Client.java
│   ├── Menu.java
│   ├── PlatMenu.java
│   ├── Restaurant.java
│   ├── Utilisateur.java
│   └── enums (Role, TypeMenu, TypeService, Statut*)
├── repository
│   ├── ClientRepository.java
│   ├── MenuRepository.java
│   ├── PlatMenuRepository.java
│   ├── RestaurantRepository.java
│   └── UtilisateurRepository.java
└── service
    ├── ClientService.java
    ├── MenuService.java
    ├── PlatMenuService.java
    ├── RestaurantService.java
    └── CustomUserDetailsService.java

src/main/resources
├── application-mysql.properties   # Configuration DB
├── static/ (css, js)
└── templates/
    ├── accueil/index.html
    ├── restaurants/liste.html
    ├── restaurants/detail.html
    ├── restaurants/menu.html
    ├── reservations/nouvelle.html
    ├── admin/dashboard.html
    ├── admin/menus.html
    ├── admin/nouveauMenu.html
    ├── admin/nouveauPlat.html
    ├── login.html
    └── contact.html
```

---

## ⚙️ Installation & Configuration

### Prérequis

- **JDK 17** ou supérieur
- **MySQL Server 8.0** (ou H2 pour test rapide)
- **Maven 3.9+** (ou utilisation du wrapper inclus)
- **Git** (optionnel)

### 1. Cloner le dépôt

```bash
git clone https://github.com/votre-username/campus-dang-food.git
cd campus-dang-food
```

### 2. Configurer la base de données

Créez une base MySQL (par ex. `campusdangdb`) :

```sql
CREATE DATABASE campusdangdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
```

Modifiez `src/main/resources/application-mysql.properties` :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/campusdangdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=VotreMotDePasse
```

> 💡 Pour un test rapide sans MySQL, remplacez par `spring.profiles.active=h2` et décommentez la dépendance H2.

### 3. Lancer l’application

Avec Maven Wrapper :

```bash
./mvnw spring-boot:run
```

Ou avec Maven global :

```bash
mvn clean install
mvn spring-boot:run
```

L’application est accessible sur : [http://localhost:8080](http://localhost:8080)

---

## 🔐 Variables d’environnement (sécurité)

Pour une production, externalisez ces secrets :

```bash
export DB_USERNAME=prod_user
export DB_PASSWORD=SecurePass123
export JWT_SECRET=votre_secret_jwt
```

Dans `application.properties` :

```properties
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

---

## 🚀 Démarrage rapide

| Action | URL |
|--------|-----|
| Accueil public | [http://localhost:8080](http://localhost:8080) |
| Liste des restaurants | [http://localhost:8080/restaurants](http://localhost:8080/restaurants) |
| Réservation table | [http://localhost:8080/reservations/nouvelle](http://localhost:8080/reservations/nouvelle) |
| Administration | [http://localhost:8080/admin](http://localhost:8080/admin) |
| Connexion admin | [http://localhost:8080/login](http://localhost:8080/login) |

---

## 👥 Comptes par défaut (initialisés automatiquement)

| Email | Mot de passe | Rôle |
|-------|--------------|------|
| `chef@campusdang.cm` | `chef123` | 🧑‍🍳 CHEF |
| `serveur@campusdang.cm` | `serveur123` | 🍽️ SERVEUR |
| `jean@email.com` | `123456` | 👤 CLIENT (démonstration) |

> ⚠️ En production, modifiez immédiatement ces identifiants.

---

## 🌐 API & Endpoints clés

### Endpoints publics

```http
GET  /                           # Page d'accueil
GET  /restaurants                # Liste restaurants
GET  /restaurants/{id}           # Détail restaurant
GET  /restaurants/{id}/menu/{type}  # Menu spécifique
GET  /reservations/nouvelle      # Formulaire réservation
POST /reservations               # (prévu) Sauvegarde réservation
```

### Endpoints protégés (ADMIN / CHEF / SERVEUR)

```http
GET    /admin                    # Dashboard
GET    /admin/menus/{restoId}    # Menus du restaurant
POST   /admin/menus/sauvegarder  # Créer menu
GET    /admin/plats/nouveau/{menuId}
POST   /admin/plats/sauvegarder  # Ajouter plat
```

---

## 📸 Captures d’écran

> *(À venir – vous pouvez ajouter ici des images via `![alt](url)`)*

| Accueil | Détail restaurant | Panier commande |
|---------|------------------|------------------|
| ![](https://via.placeholder.com/400x200?text=Home+Page) | ![](https://via.placeholder.com/400x200?text=Restaurant) | ![](https://via.placeholder.com/400x200?text=Cart) |

---

## 🗺 Feuille de route

- [x] Authentification Spring Security
- [x] CRUD restaurants / menus / plats
- [x] Panier et commande locale (LocalStorage)
- [x] Réservation de tables avec validation places
- [ ] Paiement réel (Stripe / Orange Money API)
- [ ] Back-office commandes (statuts EN_ATTENTE, LIVRÉE)
- [ ] Export Excel des ventes
- [ ] Dashboard analytics (chiffre d’affaires, plats populaires)

---

## 🤝 Contribution

Les contributions sont les bienvenues !  
Suivez ces étapes :

1. **Fork** le projet.
2. Créez votre branche (`git checkout -b feature/amazing-feature`).
3. **Commit** vos changements (`git commit -m 'Add some amazing feature'`).
4. **Push** (`git push origin feature/amazing-feature`).
5. Ouvrez une **Pull Request**.

Merci de respecter les conventions de code et d’ajouter des tests si nécessaire.

---

## 📄 Licence

Distribué sous la licence **MIT**. Voir le fichier `LICENSE` pour plus d’informations.

---

<div align="center">
  
  **Développé avec ☕ et 🍽️ par l’équipe Campus Dang**  
  
  [📧 Email](mailto:contact@campusdang.cm) · [🌐 Site web](https://campusdang.cm) · [🐦 Twitter](https://twitter.com/campusdang)
  
</div>
```

---
