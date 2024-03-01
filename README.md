# Spring Boot CRUD 


## Introduction

### Spring Boot
[Spring Boot](https://spring.io/projects/spring-boot) is one of the most famous [Spring](https://spring.io/projects/spring-framework) project used nowadays. It came to facilitate the process of configuring and publishing enterprise applications. It helps create stand-alone, production-grade Spring based applications with minimal effort. **Spring Boot** was conceived to be an "opinionated framework" because it follows an opinionated default configuration approach which reduces the developer efforts configuring the application.

Each application built using **Spring Boot** needs merely to define a Java class annotated with `@SpringBootApplication` as its main entry point. This annotation encapsulates the following other annotations:
- `@Configuration` – marks the class as a source of bean definitions.
- `@EnableAutoConfiguration` – indicates to the framework to add beans based on the dependencies on the classpath automatically.
- `@ComponentScan` – scans for other configurations and beans in the same package as the Application class or below.

### CRUD Application
The most common way to start using **Spring Boot** is by implementing a CRUD (a.k.a **C**reate, **R**ead, **U**pdate, **D**elete) REST application. I particularly consider it a "Hello World" when it comes to microservice frameworks, because most of what it is used for is related to building APIs. ***A CRUD application essentially contains the very basic functionalities that every API could have.***


## Project Structure
When working with **Spring Boot** projects there is no constrained package structure and the actual structure will be driven by your requirement. However, for convenience and simplicity's sake, the structure of this sample project is organized, not totally though, by following the MVC (a.k.a. **M**odel **V**iew **C**ontroller) Pattern. You can find more details about this pattern [here](https://examples.javacodegeeks.com/spring-mvc-architecture-overview-example/).



## Prerequisites
- Maven 3+
- Java 8+
- MySQL 8


## Libraries and Dependencies
- Spring Web
- Spring Data JPA
- MySQL Driver

## Backend API

- POST     /students
- GET      /students      
- PUT      /students/{id}
- DELETE   /students/{id}


## The Sample Project
This sample project implementes an API to manage applications produced by a fictitious software company. For each application release, its name, version and developer are registered. An H2 in-memory database is being used, but you can easily set up a real database if you like. For instance, to configure a MySQL database you'd only need to do the following two steps:


2. Add MySQL connection properties to [application.yml](./src/main/resources/application.yml)
````yaml
spring:
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/userdb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
server.port=7171

````


