# SpringLearn

## Overview

SpringLearn is a Spring Boot RESTful Web Services project developed as part of the Cognizant Digital Nurture 4.0 Deep Skilling Program. This project demonstrates the implementation of REST APIs using Spring Boot, XML Bean Configuration, Exception Handling, and MockMvc testing.

---

## Objectives

- Understand HTTP Request and HTTP Response.
- Develop RESTful Web Services using Spring Boot.
- Return JSON responses using Spring MVC.
- Implement GET APIs.
- Handle exceptions using custom exception classes.
- Perform unit testing using MockMvc.

---

## Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Context
- Maven
- JUnit 5
- MockMvc
- Jackson
- XML Bean Configuration

---

## Project Structure

```
SpringLearn
│
├── pom.xml
├── README.md
│
├── src
│   ├── main
│   │   ├── java
│   │   │
│   │   └── com.cognizant.springlearn
│   │       ├── SpringLearnApplication.java
│   │       ├── controller
│   │       │      HelloController.java
│   │       │      CountryController.java
│   │       ├── model
│   │       │      Country.java
│   │       ├── service
│   │       │      CountryService.java
│   │       ├── exception
│   │       │      CountryNotFoundException.java
│   │       └── util
│   │              CountryUtil.java
│   │
│   └── resources
│          application.properties
│          country.xml
│
└── test
    └── SpringLearnApplicationTests.java
```

---

## REST APIs

### 1. Hello World API

**Request**

```
GET /hello
```

**URL**

```
http://localhost:8083/hello
```

**Response**

```
Hello World!!
```

---

### 2. Get India

**Request**

```
GET /country
```

**Response**

```json
{
    "code": "IN",
    "name": "India"
}
```

---

### 3. Get All Countries

**Request**

```
GET /countries
```

**Response**

```json
[
    {
        "code": "IN",
        "name": "India"
    },
    {
        "code": "US",
        "name": "United States"
    },
    {
        "code": "JP",
        "name": "Japan"
    },
    {
        "code": "DE",
        "name": "Germany"
    }
]
```

---

### 4. Get Country By Code

**Request**

```
GET /countries/IN
```

or

```
GET /countries/in
```

**Response**

```json
{
    "code": "IN",
    "name": "India"
}
```

---

### 5. Invalid Country

**Request**

```
GET /countries/AZ
```

**Response**

```json
{
    "timestamp":"...",
    "status":404,
    "error":"Not Found",
    "message":"Country not found",
    "path":"/countries/AZ"
}
```

---

## Running the Project

### Clone Repository

```bash
git clone https://github.com/your-username/SpringLearn.git
```

### Open Project

Import the project into Eclipse, IntelliJ IDEA, or Spring Tool Suite as a Maven project.

### Run

Run

```
SpringLearnApplication.java
```

Application starts on

```
http://localhost:8083
```

---

## Testing

Run

```
SpringLearnApplicationTests.java
```

The following test cases are included:

- Controller Loading Test
- Get Country Test
- Get All Countries Test
- Get Country By Code Test
- Invalid Country Test

---

## Expected Output

### Browser

```
http://localhost:8083/hello
```

Output

```
Hello World!!
```

---

```
http://localhost:8083/country
```

Output

```json
{
    "code":"IN",
    "name":"India"
}
```

---

```
http://localhost:8083/countries
```

Output

```json
[
  {
    "code":"IN",
    "name":"India"
  },
  {
    "code":"US",
    "name":"United States"
  },
  {
    "code":"JP",
    "name":"Japan"
  },
  {
    "code":"DE",
    "name":"Germany"
  }
]
```

---

## Features

- Spring Boot REST API
- XML Bean Configuration
- JSON Response
- GET Mapping
- Path Variable
- Exception Handling
- Logging
- MockMvc Testing
- Maven Project

---
