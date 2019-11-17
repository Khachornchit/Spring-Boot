[![Build Status](https://travis-ci.org/Khachornchit/Java-Spring-Boot.svg?branch=master)](https://travis-ci.org/Khachornchit/Java-Spring-Boot) [![CircleCI](https://circleci.com/gh/khachornchit/Java-Spring-Boot.svg?style=svg)](https://circleci.com/gh/khachornchit/Java-Spring-Boot)

# Spring Boot
Java development using Spring Boot framework and Gradle for RESTful API development.

## Technology Stack
* Java, Spring Boot, RESTful API
* Gradle
* CICD Integration

## Prerequisite
* Install [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Install [Gradle 6.0](https://gradle.org/)

## Getting started

** Clone the repository **

```txt
git clone git@github.com:khachornchit/java-spring-boot.git
```

** Build and run the project **

```txt
cd java-spring-boot
gradle build
gradle test
gradle bootRun
```

## CRUD
```
POST   http://localhost:8080/customers
GET    http://localhost:8080/customers
GET    http://localhost:8080/customers/{id}
PUT    http://localhost:8080/customers/{id}
DELETE http://localhost:8080/customers/{id}
```

## DATA
```json
[
   {
      "id":1,
      "firstName":"Jack",
      "lastName":"Davis"
   },
   {
      "id":2,
      "firstName":"Oliver",
      "lastName":"Miller"
   },
   {
      "id":3,
      "firstName":"Samuel",
      "lastName":"Brown"
   }
]
```
