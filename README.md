[![Build Status](https://travis-ci.org/Khachornchit/Java-Spring-Boot.svg?branch=master)](https://travis-ci.org/Khachornchit/Java-Spring-Boot)

# Spring Boot

Spring Boot is an open source Java-based framework used to create a micro Service. Most Spring Boot applications need very little Spring configuration. Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".

This is a sample project of using Spring Boot and Gradle to develop a simple backend RESTful API function.

## Technology Stack
* Java, Spring Boot, RESTful API
* Gradle
* Travis CI

## Pre-requires
* Install [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* Install [Gradle](https://gradle.org/)

## Getting started
* Clone the respository
```
git clone git@github.com:Khachornchit/Java-Spring-Boot.git
```
* Build and run the project
```
cd Java-Spring-Boot
./gradlew build
./gradlew bootRun
```

## REST API Endpoint
* [API Endpoint](http://localhost:8080/)
* [JSON /customers](http://localhost:8080/customers)

## CRUD
* POST /customers
* GET /customers
* GET /customers/{id}
* PUT /customers/{id}
* DELETE /customers/{id}