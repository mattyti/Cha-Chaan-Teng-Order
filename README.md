# Cha Chaan Teng POS System (茶餐廳落單系統) ☕

A backend Point of Sale (POS) system built for traditional Hong Kong tea restaurants. This system provides RESTful APIs to streamline order creation, menu management, and kitchen status updates.

## 🏗️ Architecture & Design
This project strictly follows the **3-Tier Layered Architecture** (Controller - Service - Repository) to ensure separation of concerns, scalability, and maintainability—aligning with enterprise-level development standards.

## 💻 Tech Stack
* **Language:** Java 21
* **Framework:** Spring Boot 4.1.2
* **Database:** MySQL
* **ORM:** Spring Data JPA / Hibernate (`@OneToMany` mapping)
* **Database Migration:** Flyway
* **Tools:** Lombok, Maven

## ✨ Core API Endpoints
* `POST /api/orders` - Submit a new order with multiple items (automatically handles bi-directional entity mapping).
* `GET /api/orders` - Retrieve all orders for kitchen display.
* `GET /api/menus` - Retrieve all available menu items.

## 🚀 Getting Started (How to run locally)
1. **Clone the repository:**
   ```bash
   git clone [https://github.com/mattyti/Cha-Chaan-Teng-Order.git](https://github.com/mattyti/Cha-Chaan-Teng-Order.git)
