[![Build Status](https://travis-ci.org/Khachornchit/Java-Spring-Boot.svg?branch=master)](https://travis-ci.org/Khachornchit/Java-Spring-Boot) [![CircleCI](https://circleci.com/gh/khachornchit/Java-Spring-Boot.svg?style=svg)](https://circleci.com/gh/khachornchit/Java-Spring-Boot)

# Spring Boot
It is a sample of Java development using Spring Boot framework and Gradle for a simple RESTful API function. Spring Boot is an open source Java-based framework used to create a microservices. Most Spring Boot applications need very little Spring configuration. Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".

## Technology Stack
* Java, Spring Boot, RESTful API
* Gradle
* CICD Integration

## Prerequisite
* Install [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Install [Gradle](https://gradle.org/)

## Getting started

Clone the repository

```txt
git clone git@github.com:khachornchit/java-spring-boot.git
```

Build and run the project

```txt
cd java-spring-boot
./gradle build --scan
./gradle bootRun --scan
```

## REST API Endpoint
```
* API Endpoint - http://localhost:8080/
* /customers   - http://localhost:8080/customers
```

## CRUD
```
POST /customers
GET /customers
GET /customers/{id}
PUT /customers/{id}
DELETE /customers/{id}
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
