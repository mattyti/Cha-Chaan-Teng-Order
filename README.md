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
   
Database Setup:
Create a MySQL database named cha_chaan_teng. (No need to create tables manually, Flyway will handle the schema migrations automatically on startup).

Run the application:

Bash
./mvnw spring-boot:run
⚠️ Note on UI
The frontend HTML interface included in this repository serves purely as a functional API testing tool. My core focus and 100% of my development effort for this project is on the Java Spring Boot Backend (Architecture, Database, API design).

📸 API Testing Screenshot:
<img width="1205" height="610" alt="image" src="https://github.com/user-attachments/assets/e7bd0406-8632-4321-87d6-042f07c142e2" />
<img width="2026" height="577" alt="image" src="https://github.com/user-attachments/assets/52788546-c412-4d7b-944f-08a546ddba9e" />
<img width="870" height="1023" alt="image" src="https://github.com/user-attachments/assets/9d9fa868-1338-4625-a346-efa048db1f33" />

