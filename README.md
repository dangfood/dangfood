<div align="center">

<img src="https://img.icons8.com/color/96/000000/restaurant.png" alt="Campus Dang Food Logo" width="96"/>

# Campus Dang Food

### Plateforme de Restauration & Réservation — Cœur du Cameroun

[![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://mysql.com)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)](https://www.thymeleaf.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-22c55e?style=for-the-badge)](LICENSE)

> *Une expérience gastronomique haut de gamme alliant tradition camerounaise et innovation technologique.*

[🚀 Démo en ligne](#) · [📖 Documentation](#) · [🐛 Signaler un bug](../../issues/new?template=bug_report.md) · [✨ Suggérer une idée](../../issues/new?template=feature_request.md)

---

</div>

## 📋 Table des matières

1. [Aperçu du projet](#-aperçu-du-projet)
2. [Fonctionnalités principales](#-fonctionnalités-principales)
3. [Stack technique](#-stack-technique)
4. [Architecture du projet](#-architecture-du-projet)
5. [Installation & Configuration](#-installation--configuration)
6. [Variables d'environnement](#-variables-denvironnement)
7. [Démarrage rapide](#-démarrage-rapide)
8. [Comptes par défaut](#-comptes-par-défaut)
9. [API & Endpoints](#-api--endpoints)
10. [Feuille de route](#-feuille-de-route)
11. [Contribution](#-contribution)
12. [Licence](#-licence)

---

## 🚀 Aperçu du projet

**Campus Dang Food** est une application web complète de gestion de restauration dédiée aux établissements situés autour du campus universitaire de Dang (Ngaoundéré, Cameroun). Elle centralise la découverte des restaurants, la commande en ligne et la réservation de tables dans une interface moderne et premium.

**Trois types de restaurants** sont référencés : Grillade · Bar Lounge · Gastronomique

**Trois services** couverts : Petit-déjeuner · Déjeuner · Dîner

---

## ✨ Fonctionnalités principales

### Côté Client 👤

| Module | Description |
|--------|-------------|
| 🏠 **Accueil dynamique** | Présentation des restaurants, statistiques en temps réel, animations particules |
| 🍽️ **Exploration restaurants** | Filtrage par type (grillade, bar, restaurant gastronomique) |
| 📋 **Menus détaillés** | Affichage par catégorie : traditionnel, moderne, dessert, boisson |
| 🛒 **Panier & commande** | Ajout/suppression d'articles, calcul automatique du total, validation |
| 💳 **Paiement simulé** | MTN Mobile Money · Orange Money · VISA (mode démonstration) |
| 📅 **Réservation de tables** | Sélection restaurant → formulaire → choix de table en temps réel |
| 📄 **Reçu PDF** | Génération d'un ticket de réservation/commande imprimable |

### Côté Administration 🔐

| Rôle | Permissions |
|------|-------------|
| **CHEF** | Gestion complète des menus, création/modification/suppression de plats, accès au dashboard |
| **SERVEUR** | Consultation des commandes, mise à jour des statuts |

La sécurité repose sur **Spring Security** avec mots de passe hashés en **BCrypt** et gestion de sessions personnalisées.

### Fonctionnalités transverses 🌐

- Design **dark mode premium** (effets dorés, particules flottantes, animations fluides)
- Interface **100% responsive** (mobile, tablette, desktop)
- Persistance locale des commandes via **LocalStorage**
- Filtrage en temps réel des plats par catégorie
- Notifications **toast** pour les actions utilisateur

---

## 🧰 Stack technique

### Backend

| Technologie | Version | Rôle |
|-------------|---------|------|
| Java JDK | 17 | Langage principal |
| Spring Boot | 3.2.0 | Framework MVC & conteneur IoC |
| Spring Security | 6.x | Authentification & autorisations |
| Spring Data JPA | 3.x | ORM & repositories |
| MySQL Connector | 8.x | Driver base de données |
| H2 Database | runtime | Tests & développement rapide |
| Lombok | latest | Réduction du boilerplate |
| Maven | 3.9+ | Gestion des dépendances & build |

### Frontend

| Technologie | Usage |
|-------------|-------|
| Thymeleaf 3.1 | Moteur de templates HTML côté serveur |
| HTML5 / CSS3 | Structure, mise en page & animations |
| JavaScript ES6+ | Panier, filtres, modales, LocalStorage |
| html2pdf.js | Génération de reçus PDF côté client |
| Font Awesome 6 | Icônes vectorielles |
| Google Fonts | Playfair Display + Inter |

### Outils & Qualité

- **Lombok** — Réduction du code boilerplate (`@Getter`, `@Builder`, etc.)
- **Spring DevTools** — Rechargement automatique en développement
- **Bean Validation** — Contraintes `@NotNull`, `@Email`, `@Size`
- **JUnit 5** — Tests unitaires & d'intégration
- **Maven Wrapper** — Build reproductible sans installation préalable

---

## 🏗 Architecture du projet

```
campus-dang-food/
├── src/
│   ├── main/
│   │   ├── java/com/campusdang/restauration/
│   │   │   ├── config/
│   │   │   │   ├── DataInitializer.java          # Chargement des données de démo
│   │   │   │   ├── SecurityConfig.java            # Configuration Spring Security
│   │   │   │   └── CustomUserDetailsService.java
│   │   │   ├── controller/
│   │   │   │   ├── AccueilController.java
│   │   │   │   ├── AdminController.java           # Gestion menus & plats
│   │   │   │   ├── LoginController.java
│   │   │   │   ├── ReservationController.java
│   │   │   │   └── RestaurantController.java
│   │   │   ├── model/
│   │   │   │   ├── Client.java
│   │   │   │   ├── Menu.java
│   │   │   │   ├── PlatMenu.java
│   │   │   │   ├── Restaurant.java
│   │   │   │   ├── Utilisateur.java
│   │   │   │   └── enums/                         # Role, TypeMenu, TypeService, Statut
│   │   │   ├── repository/
│   │   │   │   ├── ClientRepository.java
│   │   │   │   ├── MenuRepository.java
│   │   │   │   ├── PlatMenuRepository.java
│   │   │   │   ├── RestaurantRepository.java
│   │   │   │   └── UtilisateurRepository.java
│   │   │   └── service/
│   │   │       ├── ClientService.java
│   │   │       ├── MenuService.java
│   │   │       ├── PlatMenuService.java
│   │   │       ├── RestaurantService.java
│   │   │       └── CustomUserDetailsService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── application-mysql.properties       # Configuration base de données
│   │       ├── static/
│   │       │   ├── css/
│   │       │   └── js/
│   │       └── templates/
│   │           ├── accueil/index.html
│   │           ├── restaurants/
│   │           │   ├── liste.html
│   │           │   ├── detail.html
│   │           │   └── menu.html
│   │           ├── reservations/nouvelle.html
│   │           ├── admin/
│   │           │   ├── dashboard.html
│   │           │   ├── menus.html
│   │           │   ├── nouveauMenu.html
│   │           │   └── nouveauPlat.html
│   │           ├── login.html
│   │           └── contact.html
│   └── test/
│       └── java/com/campusdang/restauration/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## ⚙️ Installation & Configuration

### Prérequis

- ☕ **JDK 17** ou supérieur — [Télécharger](https://adoptium.net/)
- 🐬 **MySQL Server 8.0** (ou H2 pour les tests rapides)
- 📦 **Maven 3.9+** (ou utiliser le wrapper `./mvnw` inclus)
- 🔧 **Git**

### Étape 1 — Cloner le dépôt

```bash
git clone https://github.com/votre-username/campus-dang-food.git
cd campus-dang-food
```

### Étape 2 — Configurer la base de données

Créez la base de données MySQL :

```sql
CREATE DATABASE campusdangdb
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
```

Modifiez `src/main/resources/application-mysql.properties` :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/campusdangdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=VotreMotDePasse

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

> 💡 **Test rapide sans MySQL** : ajoutez `spring.profiles.active=h2` dans `application.properties` et décommentez la dépendance H2 dans `pom.xml`.

### Étape 3 — Construire & lancer

Avec le Maven Wrapper (recommandé) :

```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

Avec Maven global :

```bash
mvn clean install
mvn spring-boot:run
```

L'application est accessible sur : **[http://localhost:8080](http://localhost:8080)**

---

## 🔐 Variables d'environnement

Pour un déploiement en production, externalisez les secrets via des variables d'environnement :

```bash
export DB_URL=jdbc:mysql://localhost:3306/campusdangdb
export DB_USERNAME=prod_user
export DB_PASSWORD=SecurePass123!
export APP_SECRET=votre_secret_applicatif
```

Référencez-les dans `application.properties` :

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

> ⚠️ Ne committez **jamais** de mots de passe en clair dans votre dépôt Git. Utilisez un fichier `.env` listé dans `.gitignore`.

---

## 🚀 Démarrage rapide

Une fois l'application lancée, accédez aux URLs suivantes :

| Page | URL |
|------|-----|
| 🏠 Accueil public | [http://localhost:8080](http://localhost:8080) |
| 🍽️ Liste des restaurants | [http://localhost:8080/restaurants](http://localhost:8080/restaurants) |
| 📅 Réservation de table | [http://localhost:8080/reservations/nouvelle](http://localhost:8080/reservations/nouvelle) |
| 🔑 Connexion administration | [http://localhost:8080/login](http://localhost:8080/login) |
| 📊 Dashboard admin | [http://localhost:8080/admin](http://localhost:8080/admin) |

---

## 👥 Comptes par défaut

Les comptes suivants sont créés automatiquement au démarrage via `DataInitializer` :

| Email | Mot de passe | Rôle |
|-------|--------------|------|
| `chef@campusdang.cm` | `chef123` | 🧑‍🍳 CHEF |
| `serveur@campusdang.cm` | `serveur123` | 🍽️ SERVEUR |
| `jean@email.com` | `123456` | 👤 CLIENT (démo) |

> ⚠️ **Important** : Changez impérativement ces identifiants avant tout déploiement en production.

---

## 🌐 API & Endpoints

### Endpoints publics

```
GET  /                                  → Page d'accueil
GET  /restaurants                       → Liste de tous les restaurants
GET  /restaurants/{id}                  → Détail d'un restaurant
GET  /restaurants/{id}/menu/{type}      → Menu par type de service
GET  /reservations/nouvelle             → Formulaire de réservation
POST /reservations                      → Enregistrer une réservation
GET  /login                             → Page de connexion
GET  /contact                           → Page de contact
```

### Endpoints protégés (CHEF / ADMIN)

```
GET    /admin                           → Dashboard administration
GET    /admin/menus/{restoId}           → Menus d'un restaurant
POST   /admin/menus/sauvegarder         → Créer un nouveau menu
GET    /admin/plats/nouveau/{menuId}    → Formulaire ajout de plat
POST   /admin/plats/sauvegarder         → Ajouter un plat au menu
```

---

## 🗺 Feuille de route

- [x] Authentification & autorisation Spring Security
- [x] CRUD complet restaurants / menus / plats
- [x] Panier & commande locale (LocalStorage)
- [x] Réservation de tables avec validation des disponibilités
- [x] Génération de reçus PDF
- [ ] Intégration paiement réel (Orange Money API / Stripe)
- [ ] Gestion des statuts de commandes (EN_ATTENTE → EN_PREPARATION → LIVRÉE)
- [ ] Export Excel des ventes et statistiques
- [ ] Dashboard analytics (chiffre d'affaires, plats populaires, fréquentation)
- [ ] Application mobile (PWA ou React Native)
- [ ] Système de notifications push

---

## 🤝 Contribution

Les contributions sont les bienvenues ! Voici comment participer :

1. **Forkez** le projet
2. Créez votre branche de fonctionnalité
   ```bash
   git checkout -b feature/nom-de-la-fonctionnalite
   ```
3. Committez vos changements
   ```bash
   git commit -m "feat: description de la fonctionnalité"
   ```
4. Poussez votre branche
   ```bash
   git push origin feature/nom-de-la-fonctionnalite
   ```
5. Ouvrez une **Pull Request** avec une description claire de vos modifications

Merci de respecter les conventions de commit ([Conventional Commits](https://www.conventionalcommits.org/)) et d'ajouter des tests pour toute nouvelle fonctionnalité.

---

## 📄 Licence

Distribué sous la licence **MIT**. Voir le fichier [`LICENSE`](LICENSE) pour plus d'informations.

---

<div align="center">

**Développé avec ☕ et 🍽️ par l'équipe Campus Dang**

*Ngaoundéré, Cameroun*

[📧 contact@campusdang.cm](mailto:contact@campusdang.cm) · [🌐 campusdang.cm](https://campusdang.cm)

</div>
