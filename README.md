```markdown
<div align="center">

# Campus Dang Food

### Restaurant Management Platform — Ngaoundéré, Cameroon

[![Java](https://img.shields.io/badge/Java-17-007396?style=flat-square&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-6DB33F?style=flat-square&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?style=flat-square&logo=mysql&logoColor=white)](https://mysql.com)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-005F0F?style=flat-square&logo=thymeleaf&logoColor=white)](https://www.thymeleaf.org/)
[![Security](https://img.shields.io/badge/Security-Spring-6DB33F?style=flat-square&logo=springsecurity&logoColor=white)](https://spring.io/projects/spring-security)
[![License](https://img.shields.io/badge/License-MIT-22c55e?style=flat-square)](LICENSE)

*A premium gastronomic experience blending Cameroonian tradition with modern technology.*

</div>

---

## Overview

**Campus Dang Food** is a comprehensive web application for restaurant management, serving establishments around the Dang University Campus. The platform centralizes restaurant discovery, online ordering, and table reservations within a modern, premium interface.

**Supported restaurant types:** Grillade · Bar Lounge · Gastronomic

**Service coverage:** Breakfast · Lunch · Dinner

---

## Key Features

### Client Side

| Module | Description |
|--------|-------------|
| **Dynamic Home** | Restaurant showcase, real-time statistics, particle animations |
| **Restaurant Discovery** | Filter by type (grill, bar, gastronomic) |
| **Detailed Menus** | Categorized display: traditional, modern, dessert, beverages |
| **Shopping Cart** | Add/remove items, automatic total calculation, order validation |
| **Payment Simulation** | MTN Mobile Money · Orange Money · VISA (demonstration mode) |
| **Table Reservation** | Restaurant selection → form → real-time table choice |
| **PDF Receipt** | Printable reservation/order ticket generation |

### Administration Side

| Role | Permissions |
|------|-------------|
| **CHEF** | Full menu management, dish CRUD operations, dashboard access |
| **SERVER** | Order consultation, status updates |

Security is handled by **Spring Security** with **BCrypt** password hashing and custom session management.

### Cross-Cutting Features

- Premium dark mode design with gold accents and smooth animations
- Fully responsive interface (mobile, tablet, desktop)
- Local persistence using **LocalStorage**
- Real-time dish filtering by category
- Toast notifications for user actions

---

## Technology Stack

### Backend

| Technology | Version | Purpose |
|------------|---------|---------|
| Java JDK | 17 | Core language |
| Spring Boot | 3.2.0 | MVC framework & IoC container |
| Spring Security | 6.x | Authentication & authorization |
| Spring Data JPA | 3.x | ORM & repositories |
| MySQL Connector | 8.x | Database driver |
| H2 Database | runtime | Testing & rapid development |
| Lombok | latest | Boilerplate reduction |
| Maven | 3.9+ | Dependency management & build |

### Frontend

| Technology | Usage |
|------------|-------|
| Thymeleaf 3.1 | Server-side HTML templating |
| HTML5 / CSS3 | Structure, layout & animations |
| JavaScript ES6+ | Cart, filters, modals, LocalStorage |
| html2pdf.js | Client-side PDF receipt generation |
| Font Awesome 6 | Vector icons |
| Google Fonts | Playfair Display + Inter |

### Tools & Quality

- **Lombok** — Reduces boilerplate code with `@Getter`, `@Builder`, etc.
- **Spring DevTools** — Automatic reload during development
- **Bean Validation** — `@NotNull`, `@Email`, `@Size` constraints
- **JUnit 5** — Unit & integration tests
- **Maven Wrapper** — Reproducible builds without prior installation

---

## Project Architecture

```
campus-dang-food/
├── src/
│   ├── main/
│   │   ├── java/com/campusdang/restauration/
│   │   │   ├── config/
│   │   │   │   ├── DataInitializer.java
│   │   │   │   ├── SecurityConfig.java
│   │   │   │   └── CustomUserDetailsService.java
│   │   │   ├── controller/
│   │   │   │   ├── AccueilController.java
│   │   │   │   ├── AdminController.java
│   │   │   │   ├── LoginController.java
│   │   │   │   ├── ReservationController.java
│   │   │   │   └── RestaurantController.java
│   │   │   ├── model/
│   │   │   │   ├── Client.java
│   │   │   │   ├── Menu.java
│   │   │   │   ├── PlatMenu.java
│   │   │   │   ├── Restaurant.java
│   │   │   │   ├── Utilisateur.java
│   │   │   │   └── enums/
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
│   │       ├── application-mysql.properties
│   │       ├── static/
│   │       └── templates/
│   │           ├── accueil/
│   │           ├── restaurants/
│   │           ├── reservations/
│   │           ├── admin/
│   │           └── *.html
│   └── test/
├── pom.xml
├── mvnw
└── README.md
```

---

## Installation & Configuration

### Prerequisites

- **JDK 17** or higher — [Download](https://adoptium.net/)
- **MySQL Server 8.0** (or H2 for quick testing)
- **Maven 3.9+** (or use the included `./mvnw` wrapper)
- **Git**

### Step 1 — Clone the repository

```bash
git clone https://github.com/your-username/campus-dang-food.git
cd campus-dang-food
```

### Step 2 — Configure the database

Create the MySQL database:

```sql
CREATE DATABASE campusdangdb
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
```

Update `src/main/resources/application-mysql.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/campusdangdb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=YourPassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```

> **Quick test without MySQL**: Add `spring.profiles.active=h2` to `application.properties` and uncomment the H2 dependency in `pom.xml`.

### Step 3 — Build & Run

Using Maven Wrapper (recommended):

```bash
# Linux / macOS
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

Using global Maven:

```bash
mvn clean install
mvn spring-boot:run
```

The application will be available at: **[http://localhost:8080](http://localhost:8080)**

---

## Environment Variables

For production deployment, externalize secrets via environment variables:

```bash
export DB_URL=jdbc:mysql://localhost:3306/campusdangdb
export DB_USERNAME=prod_user
export DB_PASSWORD=SecurePass123
export APP_SECRET=your_application_secret
```

Reference them in `application.properties`:

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

> **Security note**: Never commit plaintext passwords to your Git repository. Use a `.env` file listed in `.gitignore`.

---

## Quick Start

Once the application is running, access the following URLs:

| Page | URL |
|------|-----|
| Home | [http://localhost:8080](http://localhost:8080) |
| Restaurant List | [http://localhost:8080/restaurants](http://localhost:8080/restaurants) |
| Table Reservation | [http://localhost:8080/reservations/nouvelle](http://localhost:8080/reservations/nouvelle) |
| Login | [http://localhost:8080/login](http://localhost:8080/login) |
| Admin Dashboard | [http://localhost:8080/admin](http://localhost:8080/admin) |

---

## Default Accounts

The following accounts are created automatically on startup via `DataInitializer`:

| Email | Password | Role |
|-------|----------|------|
| `chef@campusdang.cm` | `chef123` | CHEF |
| `serveur@campusdang.cm` | `serveur123` | SERVER |
| `jean@email.com` | `123456` | CLIENT (demo) |

> **Important**: Change these credentials immediately before any production deployment.

---

## API Endpoints

### Public Endpoints

```
GET  /                                  → Home page
GET  /restaurants                       → List all restaurants
GET  /restaurants/{id}                  → Restaurant details
GET  /restaurants/{id}/menu/{type}      → Menu by service type
GET  /reservations/nouvelle             → Reservation form
POST /reservations                      → Save reservation
GET  /login                             → Login page
GET  /contact                           → Contact page
```

### Protected Endpoints (CHEF / ADMIN)

```
GET    /admin                           → Dashboard
GET    /admin/menus/{restoId}           → Restaurant menus
POST   /admin/menus/sauvegarder         → Create new menu
GET    /admin/plats/nouveau/{menuId}    → Add dish form
POST   /admin/plats/sauvegarder         → Add dish to menu
```

---

## Roadmap

- [x] Spring Security authentication & authorization
- [x] Full CRUD for restaurants / menus / dishes
- [x] Shopping cart & local ordering (LocalStorage)
- [x] Table reservation with availability validation
- [x] PDF receipt generation
- [ ] Real payment integration (Orange Money API / Stripe)
- [ ] Order status management (PENDING → PREPARING → DELIVERED)
- [ ] Excel export for sales & statistics
- [ ] Analytics dashboard (revenue, popular dishes, occupancy)
- [ ] Mobile application (PWA or React Native)
- [ ] Push notification system

---

## Contributing

Contributions are welcome! Here's how to participate:

1. **Fork** the project
2. Create your feature branch
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes
   ```bash
   git commit -m "feat: description of the feature"
   ```
4. Push to your branch
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a **Pull Request** with a clear description

Please follow [Conventional Commits](https://www.conventionalcommits.org/) guidelines and add tests for any new functionality.

---

## License

Distributed under the **MIT** license. See the [`LICENSE`](LICENSE) file for more information.

---

<div align="center">

**Built with Java, Spring Boot, and precision**

*Ngaoundéré, Cameroon*

[📧 contact@campusdang.cm](mailto:contact@campusdang.cm) · [🌐 campusdang.cm](https://campusdang.cm)

</div>
```
