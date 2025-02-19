[English](README.md) | [Português](README.pt-br.md)

# 🎮 Game Racks

Uma API Moderna para Gerenciamento de Coleções de Jogos

Game Racks é uma API RESTful construída com Spring Boot projetada para gerenciar e organizar coleções de videogames. Ela fornece endpoints para gerenciar jogos e listas de jogos, tornando mais fácil categorizar e acompanhar sua biblioteca de jogos.

## 🎯 Funcionalidades

- 🎮 Sistema completo de gerenciamento de jogos
- 📋 Listas de jogos personalizáveis
- 🔍 Rastreamento detalhado de informações dos jogos
- 📊 Pontuação e categorização de jogos
- 🔐 Endpoints seguros na API
- 🎯 Ordenação de jogos dentro das listas por posição

## 🛠 Stack Tecnológico

### Backend

- Java 21
- Spring Boot 3.4.0
- Spring Data JPA
- H2 Database (Desenvolvimento)
- PostgreSQL (Produção)
- Maven

## 🏗 Estrutura do Projeto

backend/

├── src/main/java/com/gameracks/backend/ │

├── controllers/ # Endpoints da API REST │

├── entities/ # Modelos de dados │

├── repositories/ # Camada de acesso aos dados │

├── services/ # Lógica de negócios │

└── dto/ # Objetos de Transferência de Dados (DTOs)

## 🚀 Endpoints da API

### Jogos

- `GET /api/games` - Recuperar todos os jogos
- `GET /api/games/{id}` - Obter detalhes de um jogo específico

### Listas de Jogos

- `GET /api/lists` - Recuperar todas as listas de jogos
- `GET /api/lists/{listId}/games` - Obter os jogos de uma lista específica

## ⚙️ Instalação

### Pré-requisitos

- Java 21 ou superior
- Maven
- PostgreSQL (para produção)
- Docker (para conteinerização)

### Configuração para Desenvolvimento

1. Clone o repositório

```bash
git clone https://github.com/bernardoadca18/game-racks.git
cd game-racks
```

2. Configuração do Backend

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

3. Configuração do Ambiente

Desenvolvimento (`application-dev.properties`)

```properties
spring.datasource.url=jdbc:postgresql://localhost:5433/dslist
spring.datasource.username=postgres
spring.datasource.password=1234567
```

Produção (`application-prod.properties`)

```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
```

### 🐳 Implantação com Docker

1. Construa a imagem Docker

```bash
cd backend
docker build -t game-racks-backend .
```

2. Execute com Docker

```bash
docker run -p 8080:8080 game-racks-backend
```

### 🧪 Testes

A aplicação usa o banco de dados em memória H2 para testes:

```bash
cd backend
mvn test
```

### 💻 Diretrizes de Desenvolvimento

Estrutura do Backend

- `controllers/`: Endpoints da API REST
- `services/`: Implementação da lógica de negócios
- `repositories/`: Interfaces de acesso a dados
- `entities/`: Modelos de entidade do banco de dados
- `dto/`: Objetos de Transferência de Dados (DTOs)

Convenções de Nomenclatura

- Controladores: `*Controller.java`
- Serviços: `*Service.java`
- Repositórios: `*Repository.java`
- Entidades: Nome no singular (ex.: `Game.java`)

### 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

### 🤝 Contribuindo

1. Faça um fork do repositório
2. Crie sua branch de funcionalidade (`git checkout -b feature/MinhaFuncionalidade`)
3. Faça commit das suas alterações (`git commit -m 'Adicionar MinhaFuncionalidade'`)
4. Faça push para a branch (`git push origin feature/MinhaFuncionalidade`)
5. Abra um Pull Request

### 👤 Meta

Criado por bernardoadca18 - Perfil no GitHub

Link do Projeto: [https://github.com/bernardoadca18/game-racks](https://github.com/bernardoadca18/game-racks)
