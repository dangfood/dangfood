<div align="center">

# ✦ CAMPUS DANG FOOD ✦
**P L A T F O R M E &nbsp; D E &nbsp; G E S T I O N &nbsp; G A S T R O N O M I Q U E**

*Une expérience premium alliant la tradition culinaire camerounaise à la technologie de pointe.*

<br />

[![Java](https://img.shields.io/badge/Java_17-007396?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot_3.2-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/)
[![MySQL](https://img.shields.io/badge/MySQL_8.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://mysql.com)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)](https://www.thymeleaf.org/)
[![Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)](https://spring.io/projects/spring-security)

---

**[Fonctionnalités](#-fonctionnalités-clés)** • 
**[Technologies](#-stack-technologique)** • 
**[Installation](#-déploiement--installation)** • 
**[API](#-api--endpoints)** • 
**[Roadmap](#-vision--roadmap)** 

</div>

---

> **Campus Dang Food** est une solution centralisée de haute volée destinée aux établissements du campus universitaire de Dang (Ngaoundéré). De la découverte des menus à la réservation de tables, jusqu'à la simulation de paiements mobiles, la plateforme redéfinit la gestion de la restauration locale avec une interface moderne, fluide et sécurisée.

---

## ✧ Fonctionnalités Clés

### 👤 Expérience Client (Frontend)
L'interface est conçue avec un **Dark Mode Premium** agrémenté d'accents dorés et d'animations fluides, offrant un parcours utilisateur luxueux et intuitif.

*   **Découverte Intuitive :** Filtrage en temps réel par catégorie d'établissement (*Grillade, Bar Lounge, Gastronomique*).
*   **Menu Dynamique :** Catégorisation intelligente (traditionnel, moderne, desserts, boissons) avec mise à jour asynchrone.
*   **Panier & Commande :** Calculs automatiques, gestion des quantités et validation en quelques clics via `LocalStorage`.
*   **Paiement Omnicanal (Simulation) :** <kbd>MTN Mobile Money</kbd> • <kbd>Orange Money</kbd> • <kbd>VISA</kbd>.
*   **Réservation Intelligente :** Sélection de table en temps réel avec génération instantanée de ticket PDF (`html2pdf.js`).

### 🛡️ Espace Administration (Backend)
Sécurisé par **Spring Security** (hachage BCrypt & gestion de session avancée), le back-office est structuré par rôles :

| Rôle | Accès & Privilèges |
| :--- | :--- |
| <kbd>CHEF</kbd> | Maîtrise totale du catalogue : CRUD des menus et plats, accès aux tableaux de bord analytiques. |
| <kbd>SERVER</kbd> | Gestion opérationnelle : Suivi en direct des commandes, mise à jour des statuts. |

---

## ✧ Stack Technologique

<details>
<summary><b>🔧 Cliquez pour déployer l'architecture technique détaillée</b></summary>
<br>

**Noyau & Backend**
*   **Core :** Java JDK 17
*   **Framework :** Spring Boot 3.2.0 (MVC, IoC)
*   **Sécurité :** Spring Security 6.x
*   **Persistance :** Spring Data JPA 3.x / Hibernate
*   **Base de données :** MySQL 8.x (Prod) / H2 (Dev/Tests)
*   **Build & Outils :** Maven 3.9+, Lombok, Bean Validation

**Interface & Frontend**
*   **Rendu Serveur :** Thymeleaf 3.1
*   **Structure & Style :** HTML5, CSS3 (Animations avancées, Responsive Design)
*   **Logique Client :** JavaScript ES6+ (Modals, Filtres, Panier)
*   **Ressources :** Font Awesome 6, Google Fonts (*Playfair Display & Inter*)
*   **Génération :** html2pdf.js (Facturation client)

</details>

<details>
<summary><b>📁 Cliquez pour explorer l'arborescence du projet</b></summary>
<br>

```text
campus-dang-food/
├── src/main/java/com/campusdang/restauration/
│   ├── config/        # Fichiers de configuration (Sécurité, Initialisation Data)
│   ├── controller/    # Endpoints MVC et API (Accueil, Admin, Réservation...)
│   ├── model/         # Entités JPA (Client, Menu, Restaurant...)
│   ├── repository/    # Interfaces Spring Data
│   └── service/       # Logique métier et règles de gestion
├── src/main/resources/
│   ├── static/        # Assets (CSS, JS, Images, Polices)
│   └── templates/     # Vues Thymeleaf (Admin, Réservations, Restaurants)
└── pom.xml            # Gestionnaire de dépendances Maven

```

---

## ✧ Déploiement & Installation

### Prérequis Système

Assurez-vous de disposer de l'environnement suivant :
**JDK 17+** • **MySQL 8.0** • **Maven 3.9+** (ou via le wrapper inclus) • **Git**

### 1. Clonage & Base de données

```bash
# Cloner le dépôt
git clone [https://github.com/votre-utilisateur/campus-dang-food.git](https://github.com/votre-utilisateur/campus-dang-food.git)
cd campus-dang-food

```

Préparez votre instance MySQL :

```sql
CREATE DATABASE campusdangdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

```

### 2. Configuration (`application-mysql.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/campusdangdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=VotreMotDePasseUltraSécurisé

```

> 💡 **Astuce Pro :** Pour un test instantané sans configuration MySQL, activez le profil H2 dans votre `application.properties` en ajoutant : `spring.profiles.active=h2`.

### 3. Compilation & Lancement

```bash
# Via Maven Wrapper (Recommandé)
./mvnw spring-boot:run

# L'application sera accessible sur : http://localhost:8080

```

---

## ✧ Environnement & Sécurité

Pour tout déploiement en production, **n'exposez jamais vos identifiants**. Utilisez les variables d'environnement système :

```bash
export DB_URL=jdbc:mysql://localhost:3306/campusdangdb
export DB_USERNAME=prod_user
export DB_PASSWORD=SecurePass123
export APP_SECRET=votre_cle_secrete_jwt_ou_session

```

### 🔑 Comptes de Démonstration (Boot Initial)

Accessibles dès le premier lancement pour faciliter vos tests de recette :

| Identifiant | Mot de passe | Niveau d'accès |
| --- | --- | --- |
| `chef@campusdang.cm` | `chef123` | CHEF |
| `serveur@campusdang.cm` | `serveur123` | SERVER |
| `jean@email.com` | `123456` | CLIENT |

---

## ✧ API & Endpoints

**Espace Public**

* `GET  /` ➔ Portail d'accueil
* `GET  /restaurants` ➔ Découverte des établissements
* `GET  /restaurants/{id}` ➔ Fiche détaillée du restaurant
* `GET  /restaurants/{id}/menu/{type}` ➔ Consultation de la carte par service
* `GET  /reservations/nouvelle` ➔ Formulaire de réservation interactif
* `POST /reservations` ➔ Validation et traitement de la réservation
* `GET  /login` ➔ Interface d'authentification

**Espace Protégé (Nécessite authentification)**

* `GET  /admin` ➔ Tableau de bord analytique principal
* `GET  /admin/menus/{restoId}` ➔ Gestion des cartes d'un restaurant
* `POST /admin/menus/sauvegarder` ➔ Création d'un nouveau menu
* `GET  /admin/plats/nouveau/{menuId}` ➔ Interface d'ajout de plats
* `POST /admin/plats/sauvegarder` ➔ Intégration d'un plat au catalogue

---

## ✧ Vision & Roadmap

* [x] Implémentation du moteur de sécurité (Spring Security)
* [x] Architecture CRUD complète pour les établissements et cartes
* [x] Panier dynamique côté client via `LocalStorage`
* [x] Moteur de réservation avec vérification des disponibilités
* [x] Générateur de reçus PDF à la volée
* [ ] **Intégration API Paiement** (Orange Money / Stripe)
* [ ] **Pipeline de statut des commandes** (*En attente ➔ Préparation ➔ Livré*)
* [ ] **Module d'Intelligence d'Affaires** (Export Excel, Dashboard KPIs, taux d'occupation)
* [ ] **Déclinaison Mobile** (Progressive Web App ou React Native)
* [ ] **Moteur de notifications Push** (WebSockets)

---

**[ ✦ Contribuer au projet ✦ ](https://www.google.com/search?q=CONTRIBUTING.md)** | **[ ✦ Signaler un Bug ✦ ](https://www.google.com/search?q=issues)** | **[ ✦ Licence MIT ✦ ](https://www.google.com/search?q=LICENSE)**

*Façonné avec précision et passion à Ngaoundéré, Cameroun.*




[contact@campusdang.cm]()   |   [www.campusdang.cm](https://www.google.com/search?q=https://campusdang.cm)

