<div align="center">

# 🎮 Game Racks
A Modern Game Collection Management API

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.0-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-21-red.svg)](https://www.oracle.com/java/)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Latest-blue.svg)](https://www.postgresql.org/)

</div>

Game Racks is a RESTful API built with Spring Boot designed to manage and organize video game collections. It provides endpoints for managing games and game lists, making it easy to categorize and track your gaming library.

## 🎯 Features

- 🎮 Complete game management system
- 📋 Customizable game lists
- 🔍 Detailed game information tracking
- 📊 Game scoring and categorization
- 🔐 Secure API endpoints
- 🎯 Position-based game ordering within lists

## 🛠 Technology Stack

### Backend
- Java 21
- Spring Boot 3.4.0
- Spring Data JPA
- H2 Database (Development)
- PostgreSQL (Production)
- Maven

## 🏗 Project Structure
backend/ 
├── src/main/java/com/gameracks/backend/ │ 
├── controllers/ # REST API endpoints │ 
├── entities/ # Data models │
├── repositories/ # Data access layer │ 
├── services/ # Business logic │ 
└── dto/ # Data Transfer Objects


## 🚀 API Endpoints

### Games
- `GET /api/games` - Retrieve all games
- `GET /api/games/{id}` - Get specific game details

### Game Lists
- `GET /api/lists` - Retrieve all game lists
- `GET /api/lists/{listId}/games` - Get games in a specific list

## ⚙️ Installation

### Prerequisites
- Java 21 or higher
- Maven
- PostgreSQL (for production)
- Docker (for containerization)

### Development Setup

1. Clone the repository
```bash
git clone https://github.com/bernardoadca18/game-racks.git
cd game-racks
```

2. Backend Setup
```bash
cd backend
mvn clean install
mvn spring-boot:run
```

3. Environment Configuration
Development (application-dev.properties)

spring.datasource.url=jdbc:postgresql://localhost:5433/dslist
spring.datasource.username=postgres
spring.datasource.password=1234567


Production (application-prod.properties)

spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

### 🐳 Docker Deployment
1.Build the Docker image

```bash
cd backend
docker build -t game-racks-backend .
```

2. Run with Docker
```bash
docker run -p 8080:8080 game-racks-backend
```
docker run -p 8080:8080 game-racks-backend


### 🧪 Testing
The application uses H2 in-memory database for testing:

```bash
cd backend
mvn test
```


### 💻 Development Guidelines

Backend Structure

controllers/: REST API endpoints
services/: Business logic implementation
repositories/: Data access interfaces
entities/: Database entity models
dto/: Data Transfer Objects


Naming Conventions

Controllers: *Controller.java
Services: *Service.java
Repositories: *Repository.java
Entities: Singular form (e.g., Game.java)

### 📄 License
This project is licensed under the MIT License - see the LICENSE file for details.


### 🤝 Contributing
1. Fork the repository
2. Create your feature branch (git checkout -b feature/AmazingFeature)
3. Commit your changes (git commit -m 'Add some AmazingFeature')
4. Push to the branch (git push origin feature/AmazingFeature)
5. Open a Pull Request

### 👤 Meta

Created by bernardoadca18 - GitHub Profile

Project Link: https://github.com/bernardoadca18/game-racks


This README provides a comprehensive overview of your game-racks project, highlighting its features, technology stack, and setup instructions. It maintains a professional structure while providing all necessary information for development and deployment. The documentation is based on the actual codebase structure and configurations present in your repository.
