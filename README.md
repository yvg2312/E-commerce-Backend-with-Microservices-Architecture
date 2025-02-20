
# 🛍️ Ecommerce-Microservice

Backend system provides restful API for web or mobile.

[![CircleCI](https://circleci.com/gh/piomin/sample-spring-microservices-new.svg?style=svg)](https://sonarcloud.io/project/issues?resolved=false&id=hoangtien2k3_ecommerce-microservices)

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-black.svg)](https://sonarcloud.io/project/configuration?id=hoangtien2k3_ecommerce-microservices)

## Introduction

Welcome to the backend component of `ecommerce-microservice`. This Java/Kotlin backend is designed to handle the
server-side logic and data processing for my application.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit `(JDK) 17` or higher installed.
- Build tool (e.g., `Maven` or `Gradle`) installed.
- Database system (e.g., `MySQL`, `PostgreSQL`, `MongoDB`...vv) set up and configured.
- Liquibase Migration Database `MySql`
- Reactive Programming with WebFlux Reactor Spring Boot.
- Hibernate, JPA, WebFlux
- Docker build
- Restfull API
- PostMan Testing API and Client.
- Send message and receiver using Kafka server, Zookeeper, Broker.

## Features

- ✅ Using `Microservices` as a high level architecture

## Getting Started

Follow these steps to set up and run the backend:

1. Clone the repository:

```bash
   git clone https://github.com/hoangtien2k3/ecommerce-microservices.git
```

#### 1. Navigate to the project directory:

```bash
  cd project-name-backend
```

#### 2. Build the project:

```bash
  # Using Maven
  mvn clean install
  
  # Using Gradle
  gradle build
```

#### 3. Configure the database:

- Update `application.properties` or `application.yml` with your database connection details.

#### 4. Run the application:

```bash
  # Using Maven
  mvn spring-boot:run
  
  # Using Gradle
  gradle bootRun
```

## Demo
![1715441188385](https://github.com/user-attachments/assets/ea07616a-5404-4ccd-bab0-b472b67a061a)

## Technologies Used

- `Java`: The primary programming language.
- `Spring Boot`: Framework for building Java-based enterprise applications.
- `Maven/Gradle`: Build tools for managing dependencies and building the project.
- `Database`: Choose and specify the database system used (e.g., MySQL, PostgreSQL).
- `Other Dependencies`: List any additional dependencies or libraries used.

## API Documentation

Document the API endpoints and their functionalities. You can use tools like `Swagger` for
automated `API documentation`.

