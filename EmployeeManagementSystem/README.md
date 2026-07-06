# Employee Management System

## Overview

Employee Management System is a Spring Boot application developed to manage employees and departments using Spring Data JPA and the H2 in-memory database.

The project demonstrates CRUD operations, entity relationships, custom query methods, pagination, sorting, auditing, projections, and Hibernate features.

## Technologies Used

* Java 17 (or your project version)
* Spring Boot
* Spring Data JPA
* H2 Database
* Spring Web
* Lombok
* Maven

## Features

* Employee and Department management
* One-to-Many relationship between Department and Employee
* CRUD REST APIs
* Custom query methods using Spring Data JPA
* JPQL queries using `@Query`
* Named Queries
* Pagination and Sorting
* Entity Auditing
* Interface-based and DTO Projections
* Hibernate Batch Processing

## Project Structure

* `entity` – JPA entities
* `repository` – Spring Data JPA repositories
* `service` – Business logic
* `controller` – REST APIs
* `projection` – Interface and DTO projections
* `config` – Auditing configuration

## Database Configuration

The project uses the H2 in-memory database.

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=password
```

H2 Console:

```
http://localhost:8080/h2-console
```

## Running the Project

1. Clone the repository.
2. Open the project in IntelliJ IDEA or Eclipse.
3. Update Maven dependencies.
4. Run `EmployeeManagementSystemApplication`.
5. Access the REST APIs using Postman or a web browser.

## REST Endpoints

### Employee APIs

* `POST /employees`
* `GET /employees`
* `GET /employees/{id}`
* `DELETE /employees/{id}`
* `GET /employees/page?page=0&size=5&sort=name`

### Department APIs

* `POST /departments`
* `GET /departments`

## Exercises Covered

* Exercise 1 – Spring Boot Setup
* Exercise 2 – JPA Entities
* Exercise 3 – Repositories
* Exercise 4 – CRUD Operations
* Exercise 5 – Query Methods
* Exercise 6 – Pagination and Sorting
* Exercise 7 – Entity Auditing
* Exercise 8 – Projections
* Exercise 9 – Data Source Configuration
* Exercise 10 – Hibernate Features

