# Library Management System

A Spring Boot REST API developed as part of the Spring Boot assessment.

## Technologies

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Features

- Create Book
- View Books
- Update Book
- Delete Book

## REST Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | /books | Get all books |
| POST | /books | Add a new book |
| PUT | /books/{id} | Update a book |
| DELETE | /books/{id} | Delete a book |

## Run

```bash
mvn spring-boot:run