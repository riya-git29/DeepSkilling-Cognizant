# Spring Learn

## Project Overview

This project was developed as part of the **Spring Boot and Spring Core Hands-on Assessment**. It demonstrates the basic concepts of Spring Boot, XML-based bean configuration, logging, bean scopes (Singleton and Prototype), and loading collections from Spring configuration files.

## Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Boot DevTools
* Maven
* Spring Core
* SLF4J Logging

---

## Project Structure

```text
spring-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.cognizant.springlearn
│   │   │       ├── SpringLearnApplication.java
│   │   │       └── Country.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       ├── date-format.xml
│   │       └── country.xml
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

## Hands-on Implementations

### Hands-on 1

* Created a Spring Boot project using Spring Initializr.
* Added Spring Web and Spring Boot DevTools dependencies.
* Successfully ran the Spring Boot application.

### Hands-on 2

* Configured a `SimpleDateFormat` bean in `date-format.xml`.
* Loaded the bean using `ApplicationContext`.
* Parsed and displayed the date `31/12/2018`.

### Hands-on 3

* Configured logging using `application.properties`.
* Replaced `System.out.println()` with SLF4J Logger.
* Logged the application flow using INFO and DEBUG levels.

### Hands-on 4

* Created a `Country` bean in `country.xml`.
* Loaded the bean using Spring XML configuration.
* Displayed country details.

### Hands-on 5

* Demonstrated the default Singleton bean scope.
* Demonstrated Prototype bean scope by changing the bean scope in XML.

### Hands-on 6

* Created multiple country beans.
* Stored all country beans in an `ArrayList`.
* Loaded and displayed the list of countries.

---

## How to Run

1. Clone the repository.
2. Open the project in Eclipse/STS or IntelliJ IDEA.
3. Update the Maven project.
4. Run `SpringLearnApplication.java`.
5. View the logs in the console.

---

# Expected Console Output

## Hands-on 2

```
Mon Dec 31 00:00:00 IST 2018
```

---

## Hands-on 3

```
INFO  START
DEBUG Date : Mon Dec 31 00:00:00 IST 2018
INFO  END
```

---

## Hands-on 4

```
INFO  START

DEBUG Inside Country Constructor.
DEBUG Inside setCode()
DEBUG Inside setName()

DEBUG Country : Country [code=IN, name=India]

INFO  END
```

---

## Hands-on 5 (Singleton Scope)

```
INFO  START

DEBUG Inside Country Constructor.

DEBUG Inside setCode()
DEBUG Inside setName()

DEBUG First Country : Country [code=IN, name=India]

DEBUG Second Country : Country [code=IN, name=India]

INFO  END
```

**Observation:** The constructor is called **only once**, showing that Spring creates a single instance (Singleton).

---

## Hands-on 5 (Prototype Scope)

```
INFO  START

DEBUG Inside Country Constructor.
DEBUG Inside setCode()
DEBUG Inside setName()

DEBUG Inside Country Constructor.
DEBUG Inside setCode()
DEBUG Inside setName()

DEBUG First Country : Country [code=IN, name=India]

DEBUG Second Country : Country [code=IN, name=India]

INFO  END
```

**Observation:** The constructor is called **twice**, proving that a new object is created for every `getBean()` call (Prototype Scope).

---

## Hands-on 6

```
INFO  START

DEBUG Countries :
[
Country [code=IN, name=India],
Country [code=US, name=United States],
Country [code=DE, name=Germany],
Country [code=JP, name=Japan]
]

INFO  END
```

---

## Learning Outcomes

* Spring Boot Project Creation
* Spring XML Bean Configuration
* Loading Beans using ApplicationContext
* Constructor and Setter Injection
* SLF4J Logging
* Singleton Bean Scope
* Prototype Bean Scope
* Managing Collections in Spring XML

---


