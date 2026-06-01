<div align="center">

# ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ✦ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯

# ✦ CAMPUS DANG FOOD ✦

### **P L A T F O R M E  •  D E  •  G E S T I O N  •  G A S T R O N O M I Q U E**

*Là où l'héritage culinaire camerounais rencontre l'excellence technologique*

<br />

[![Java](https://img.shields.io/badge/Java_17-000000?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot_3.2-000000?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/)
[![MySQL](https://img.shields.io/badge/MySQL_8.0-000000?style=for-the-badge&logo=mysql&logoColor=white)](https://mysql.com)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-000000?style=for-the-badge&logo=thymeleaf&logoColor=white)](https://www.thymeleaf.org/)
[![Security](https://img.shields.io/badge/Spring_Security-000000?style=for-the-badge&logo=springsecurity&logoColor=white)](https://spring.io/projects/spring-security)

<br />

⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ✦ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯

<br />

**[⌘ FONCTIONNALITÉS](#-fonctionnalités-clés)** &nbsp;&nbsp;✦&nbsp;&nbsp; **[⌘ TECHNOLOGIES](#-stack-technologique)** &nbsp;&nbsp;✦&nbsp;&nbsp; **[⌘ INSTALLATION](#-déploiement--installation)** &nbsp;&nbsp;✦&nbsp;&nbsp; **[⌘ API](#-api--endpoints)** &nbsp;&nbsp;✦&nbsp;&nbsp; **[⌘ ROADMAP](#-vision--roadmap)**

<br />

⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ✦ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯

</div>

<br />

> <sub>✦ &nbsp; CAMPUS DANG FOOD &nbsp; ✦</sub><br>
> **Une solution centralisée d'exception** destinée aux établissements du campus universitaire de Dang (Ngaoundéré).<br>
> De la découverte sensorielle des menus à la réservation orchestrée, jusqu'à la simulation de paiements mobiles,<br>
> la plateforme redéfinit les codes de la gestion restauration locale avec une élégance architecturale sans précédent.

<br />

---

## ✧ FONCTIONNALITÉS CLÉS

<br />

### ⌘ EXPÉRIENCE CLIENT — *FRONTEND*

<sub>L'interface incarne une **Dark Matter Aesthetic** — profondeur infinie, accents auriques, micro-interactions haptiques — offrant un voyage utilisateur d'une fluidité cristalline.</sub>

<br>

| Catégorie | Spécification Technique |
|:---|:---|
| **⌘ Exploration Cognitive** | Système de filtrage spectral en temps réel par taxonomie d'établissement (*Grillade, Bar Lounge, Gastronomique*) |
| **⌘ Matrice Menu** | Architecture informationnelle catégorisée (traditionnel, moderne, desserts, boissons) avec rafraîchissement asynchrone |
| **⌘ Panier Quantique** | Moteur transactionnel `LocalStorage` — calculs instantanés, mutation des quantités, validation en 300ms |
| **⌘ Paiement Holistique** | <kbd>MTN Mobile Money</kbd> • <kbd>Orange Money</kbd> • <kbd>VISA</kbd> — couche de simulation transactionnelle |
| **⌘ Réservation Intelligente** | Allocation dynamique des tables avec génération asynchrone de ticket PDF (`html2pdf.js`) |

<br>

### ⌘ ESPACE ADMINISTRATION — *BACKEND*

<sub>Sanctuaire sécurisé par **Spring Security** (hachage BCrypt + gestion de session zero-trust), le back-office déploie une gouvernance granulaire par rôles :</sub>

<br>

```
╔═══════════════════════════════════════════════════════════════════════════════╗
║  ROLE : CHEF                                                                   ║
╠═══════════════════════════════════════════════════════════════════════════════╣
║  ◆  Maîtrise absolue du catalogue                                             ║
║  ◆  CRUD complet des matrices menu et plats                                   ║
║  ◆  Accès aux dashboards analytiques prédictifs                                ║
╚═══════════════════════════════════════════════════════════════════════════════╝

╔═══════════════════════════════════════════════════════════════════════════════╗
║  ROLE : SERVER                                                                 ║
╠═══════════════════════════════════════════════════════════════════════════════╣
║  ◆  Gestion opérationnelle en temps réel                                      ║
║  ◆  Tracking asynchrone des commandes                                         ║
║  ◆  Mutation des statuts transactionnels                                      ║
╚═══════════════════════════════════════════════════════════════════════════════╝
```

<br>

---

## ✧ STACK TECHNOLOGIQUE

<br>

<details>
<summary><b>⌘ ARCHITECTURE NUCLÉAIRE — DÉPLOYER LA SPÉCIFICATION</b></summary>
<br>

```yaml
Noyau & Backend:
  Core: Java JDK 17
  Framework: Spring Boot 3.2.0
  Sécurité: Spring Security 6.x
  Persistance: Spring Data JPA 3.x / Hibernate
  Base de données: MySQL 8.0
  Build: Maven 3.9+
  Outils: Lombok, Bean Validation

Interface & Frontend:
  Rendu Serveur: Thymeleaf 3.1
  Structure: HTML5 sémantique
  Style: CSS3 (Grid, Flex, Container Queries)
  Logique Client: JavaScript ES6+
  Bibliothèques: Alpine.js 3.x
  Ressources: Font Awesome 6, Google Fonts
  Génération PDF: html2pdf.js

DevOps & Qualité:
  Versioning: Git + Conventional Commits
  Tests: JUnit 5, MockMvc
  Documentation: OpenAPI 3.0
  Monitoring: Spring Actuator
```

</details>

<br>

<details>
<summary><b>⌘ ARBORESCENCE STRUCTURELLE — DÉPLOYER LA MAP</b></summary>
<br>

```text
campus-dang-food/
├── src/main/java/com/campusdang/restauration/
│   ├── config/           # Configuration zero-trust / Data seeding
│   ├── controller/       # Endpoints REST MVC
│   ├── model/            # Entités JPA / DTO
│   ├── repository/       # Spring Data interfaces
│   ├── service/          # Business orchestration
│   └── security/         # JWT / Session management
├── src/main/resources/
│   ├── static/           # Assets optimisés
│   │   ├── css/          # Design system
│   │   ├── js/           # Modules ES6
│   │   └── assets/       # Médias compressés
│   └── templates/        # Vues Thymeleaf
└── pom.xml               # Déclaration dépendances
```

</details>

<br>

---

## ✧ DÉPLOIEMENT & INSTALLATION

<br>

### ⌘ PRÉREQUIS SYSTÈME

```bash
┌─────────────────────────────────────────────────────────────────┐
│  JDK 17+          →  Java Development Kit                       │
│  MySQL 8.0+       →  Base de données relationnelle              │
│  Maven 3.9+       →  Gestionnaire de build                      │
│  Git              →  Contrôle de version                        │
└─────────────────────────────────────────────────────────────────┘
```

<br>

### ⌘ PROCÉDURE D'INSTALLATION

<details>
<summary><b>CLONAGE & CONFIGURATION</b></summary>
<br>

```bash
# 1. Acquisition du dépôt
git clone https://github.com/votre-utilisateur/campus-dang-food.git
cd campus-dang-food

# 2. Provisionnement base de données
mysql -u root -p -e "CREATE DATABASE campusdangdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;"

# 3. Configuration (application-prod.properties)
cat > src/main/resources/application-prod.properties << EOF
spring.datasource.url=jdbc:mysql://localhost:3306/campusdangdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=\${DB_PASSWORD}
spring.jpa.hibernate.ddl-auto=validate
spring.profiles.active=prod
EOF

# 4. Compilation & Lancement
./mvnw clean package
java -jar target/campus-dang-food-*.jar
```

</details>

<br>

### ⌘ VARIABLES D'ENVIRONNEMENT

```bash
export DB_URL=jdbc:mysql://localhost:3306/campusdangdb
export DB_USERNAME=prod_user
export DB_PASSWORD=$(openssl rand -base64 32)
export APP_SECRET=$(openssl rand -hex 32)
export JWT_SECRET=$(openssl rand -base64 64)
```

<br>

### ⌘ ACCÈS INITIAUX — *BOOTSTRAP CREDENTIALS*

| ⌘ IDENTIFIANT | ⌘ MOT DE PASSE | ⌘ ROLE |
|:---|:---|:---|
| `chef@campusdang.cm` | `chef123` | **CHEF** |
| `serveur@campusdang.cm` | `serveur123` | **SERVER** |
| `jean@email.com` | `123456` | **CLIENT** |

<br>

---

## ✧ API & ENDPOINTS

<br>

### ⌘ ROUTAGE PUBLIC

```http
GET    /                              →  Portail d'accueil
GET    /restaurants                   →  Découverte des établissements
GET    /restaurants/{id}              →  Fiche détaillée
GET    /restaurants/{id}/menu/{type}  →  Consultation carte
GET    /reservations/nouvelle         →  Formulaire réservation
POST   /reservations                  →  Validation réservation
GET    /login                         →  Interface authentification
```

<br>

### ⌘ ROUTAGE PROTÉGÉ

```http
GET    /admin                         →  Dashboard analytique
GET    /admin/menus/{restoId}         →  Gestion des cartes
POST   /admin/menus/sauvegarder       →  Création menu
GET    /admin/plats/nouveau/{menuId}  →  Ajout plat
POST   /admin/plats/sauvegarder       →  Intégration plat
```

<br>

### ⌘ SPÉCIFICATION OPENAPI

```yaml
openapi: 3.0.3
info:
  title: Campus Dang Food API
  version: 2.0.0
  description: Interface de gestion gastronomique
servers:
  - url: https://api.campusdang.cm/v2
```

<br>

---

## ✧ VISION & ROADMAP

<br>

```diff
[+] Implémentation moteur sécurité — Spring Security
[+] Architecture CRUD complète — Établissements & Cartes
[+] Panier dynamique client — LocalStorage
[+] Moteur réservation — Vérification disponibilités
[+] Générateur reçus PDF — html2pdf.js

[ ] Intégration API Paiement — Orange Money / Stripe
[ ] Pipeline statut commandes — En attente ➔ Préparation ➔ Livré
[ ] Module Business Intelligence — Export Excel, KPIs
[ ] Déclinaison Mobile — PWA / React Native
[ ] Moteur notifications — WebSockets temps réel
[ ] Intelligence Artificielle — Prédiction affluence
```

<br>

---

<div align="center">

<br />

**⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ✦ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯**

<br />

[![Contribuer](https://img.shields.io/badge/CONTRIBUER-000000?style=for-the-badge&logo=github&logoColor=white)](https://www.google.com/search?q=CONTRIBUTING.md)
[![Bug Report](https://img.shields.io/badge/BUG_REPORT-000000?style=for-the-badge&logo=github&logoColor=white)](https://www.google.com/search?q=issues)
[![Licence MIT](https://img.shields.io/badge/LICENCE_MIT-000000?style=for-the-badge&logo=license&logoColor=white)](https://www.google.com/search?q=LICENSE)

<br />

**✧ Façonné avec une précision chirurgicale à Ngaoundéré, Cameroun ✧**

<br />

[contact@campusdang.cm]() &nbsp;&nbsp;✦&nbsp;&nbsp; [www.campusdang.cm](https://www.google.com/search?q=https://campusdang.cm)

<br />

**⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯ ✦ ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯**

</div>
- **Micro-typographie** — séparateurs `⎯`, symboles `⌘` (commande), badges `<kbd>` 
- **Blocs ASCII élégants** — bordures unicode sophistiquées
- **Structure stratifiée** — navigation en en-tête, sections repliables, hiérarchie 3 niveaux
- **Code blocks stylisés** — YAML pour la stack, Diff pour la roadmap
- **Badges monochromes** — identité visuelle premium cohérente
