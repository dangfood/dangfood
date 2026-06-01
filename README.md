<div align="center">

```text
▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄

```

```text
          █▀▀ ▄▀█ █▀▄▀█ █▀█ █░█ █▀
          █▄▄ █▀█ █░▀░█ █▀▀ █▄█ ▄█
 
 █▀▄ ▄▀█ █▄░█ █▀▀   █▀▀ █▀█ █▀█ █▀▄   █▄░█ █▀▀ ▀▄▀ █░█ █▀
 █▄▀ █▀█ █░▀█ █▄█   █▀░ █▄█ █▄█ █▄▀   █░▀█ ██▄ █░█ █▄█ ▄█

```

`SYS.LOC: NGAOUNDÉRÉ [7.4222° N, 13.5562° E]` ⟡ `NET.STAT: O N L I N E` ⟡ `VER: 3.2.0.X`

```text
┌──────────────────────────────────────────────────────────────────────────────┐
│  [01] SYS.MODS  ⟡  [02] CORE.TECH  ⟡  [03] BOOT.SEQ  ⟡  [04] NET.ROUTES      │
└──────────────────────────────────────────────────────────────────────────────┘

```

```yaml
>_ INITIALIZING_TELEMETRY_LOG...
[OK] OVERRIDE ACCEPTED.
[OK] GASTRONOMIC MANAGEMENT PROTOCOL ENGAGED.
[i]  SYNOPSIS : Plateforme neuronale de gestion pour les établissements du 
                campus universitaire de Dang. Découverte, transaction, 
                et réservation en temps réel.

```

### ⬡ `[01] SYS.MODS` // ARCHITECTURE CLIENT-SERVEUR

```text
├─ CLIENT_INTERFACE (USR.ENV)
│  ├─ EXPLORATION  : Matrice de filtrage dynamique & cartes asynchrones
│  ├─ CART_NEXUS   : Stockage local, calcul auto-adaptatif, validation
│  ├─ PAY.SIMUL    : Passerelles MMo, Orange Money, Interface VISA
│  └─ RESERVATION  : Allocation spatiale en temps réel & export PDF (.html2pdf)
│
└─ ADMIN_INTERFACE (ROOT.ENV)
   ├─ ROLE_CHEF    : Opérations CRUD complètes, métriques de bord
   └─ ROLE_SERVEUR : Monitoring des flux de commandes, mutation de statut

```

### ⬡ `[02] CORE.TECH` // EMPREINTE TECHNOLOGIQUE

Utilisation du block `json` pour simuler un rapport système coloré (selon les thèmes GitHub) :

```json
{
  "ENGINE": {
    "core": "Java 17 (JDK)",
    "framework": "Spring Boot 3.2",
    "persistence": "Spring Data JPA / MySQL 8.0"
  },
  "CYBER_SECURITY": [
    "Spring Security 6",
    "BCrypt Hashing",
    "Session Management",
    "CSRF / CORS Policies"
  ],
  "FRONT_END_UI": {
    "render": "Thymeleaf 3.1",
    "styling": "HTML5 / CSS3 / FontAwesome",
    "logic": "ES6 JavaScript"
  }
}

```

### ⬡ `[03] BOOT.SEQ` // SÉQUENCE D'AMORÇAGE

```bash
# 1. Établir la liaison avec le dépôt principal
git clone [https://github.com/campus-dang/campus-dang-food.git](https://github.com/campus-dang/campus-dang-food.git)
cd campus-dang-food

# 2. Forger l'environnement de données
mysql -u root -p -e "CREATE DATABASE campusdangdb"

# 3. Compiler & Exécuter la matrice
./mvnw clean package
java -jar target/*.jar

```

```yaml
ROOT.ACCESS_CODES:
  - user: chef@campusdang.cm
    pass: chef123
    auth: [CHEF_LEVEL]

  - user: serveur@campusdang.cm
    pass: serveur123
    auth: [SERVER_LEVEL]

  - user: jean@email.com
    pass: 123456
    auth: [GUEST_LEVEL]

```

### ⬡ `[04] NET.ROUTES` // ENDPOINTS API

```text
 ████████████████████████████████░░░░░░░░ PUBLIC_GRID

 GET    /                              [INIT.HOME]
 GET    /restaurants                   [FETCH.LIST]
 GET    /restaurants/{id}              [FETCH.NODE]
 GET    /restaurants/{id}/menu/{type}  [FETCH.INVENTORY]
 POST   /reservations                  [PUSH.ALLOCATION]

 ████████████████████████████████████████ SECURE_GRID (AUTH REQ.)

 GET    /admin                         [INIT.DASHBOARD]
 POST   /admin/menus                   [PUSH.MENU]
 PUT    /admin/menus/{id}              [UPDATE.MENU]
 DELETE /admin/menus/{id}              [WIPE.MENU]
 POST   /admin/plats                   [PUSH.ITEM]
 PUT    /admin/commandes/{id}/statut   [UPDATE.FLOW]

```

### ⬡ `[05] CHRONO.MAP` // HORIZON DES ÉVOLUTIONS

```diff
+ [OK] Moteur de sécurité Spring Security implémenté
+ [OK] Matrices CRUD (Établissements & Menus) actives
+ [OK] Panier client en LocalStorage déployé
+ [OK] Générateur PDF opérationnel
! [IN] Pipeline de statut des commandes (En cours d'intégration)
! [IN] Intégration paiement Orange/MTN (Phase de test API)
- [WAIT] Application mobile React Native
- [WAIT] Prédiction d'affluence par Intelligence Artificielle
- [WAIT] Websockets (Notifications Push temps réel)

```

```text
╔══════════════════════════════════════════════════════════════════════════════╗
║                                                                              ║
║   [ ✉ contact@campusdang.cm ]                   [ 🌐 campusdang.cm ]         ║
║                                                                              ║
╚══════════════════════════════════════════════════════════════════════════════╝
