# SpringLearn – RESTful Web Service

## Objective

This project demonstrates the implementation of RESTful Web Services using Spring Boot. It includes CRUD operations, input validation, global exception handling, and testing of REST APIs using Postman and MockMvc.

## Technologies Used

* Java 17
* Spring Boot 3
* Spring Web
* Spring Data JPA
* Spring Validation
* Maven
* Postman
* MockMvc

## Project Features

* GET REST API to retrieve Employees
* GET REST API to retrieve Departments
* GET REST API to retrieve Countries
* POST REST API to add a Country
* PUT REST API to update Employee details
* DELETE REST API to delete an Employee
* Bean Validation using Jakarta Validation
* Global Exception Handling using `@ControllerAdvice`
* Custom `EmployeeNotFoundException`
* MockMvc test for exceptional scenarios

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.cognizant.springlearn
│   │       ├── controller
│   │       ├── dao
│   │       ├── service
│   │       ├── model
│   │       ├── exception
│   │       └── SpringLearnApplication.java
│   └── resources
│       ├── application.properties
│       ├── employee.xml
│       └── country.xml
└── test
    └── EmployeeControllerTest.java
```

## REST API Endpoints

| Method | Endpoint          | Description                 |
| ------ | ----------------- | --------------------------- |
| GET    | `/employees`      | Get all employees           |
| GET    | `/departments`    | Get all departments         |
| GET    | `/countries`      | Get all countries           |
| POST   | `/countries`      | Add a new country           |
| PUT    | `/employees`      | Update an existing employee |
| DELETE | `/employees/{id}` | Delete an employee by ID    |

## Sample POST Request

```json
{
  "code": "IN",
  "name": "India"
}
```

## Sample PUT Request

```json
{
  "id": 1001,
  "name": "Riya Tripathi",
  "salary": 65000,
  "permanent": true,
  "dateOfBirth": "15/08/2004",
  "department": {
    "id": 101,
    "name": "IT"
  },
  "skills": [
    {
      "id": 1,
      "name": "Java"
    },
    {
      "id": 2,
      "name": "Spring"
    }
  ]
}
```

## Testing

The APIs were tested using:

* Postman
* MockMvc

## Validation

The application validates request data using Jakarta Validation annotations such as:

* `@NotNull`
* `@NotBlank`
* `@Size`
* `@Min`
* `@Valid`
* `@JsonFormat`

## Exception Handling

Global exception handling is implemented using `@ControllerAdvice` to return meaningful error responses for:

* Validation failures
* Invalid JSON input
* Incorrect data types
* Employee not found

## Expected Output

* Employee details are retrieved successfully.
* Department details are retrieved successfully.
* Country details are retrieved successfully.
* New countries can be added successfully.
* Employee details can be updated successfully.
* Employees can be deleted successfully.
* Invalid requests return appropriate HTTP error responses (400/404).

## Author

**Riya Tripathi**
