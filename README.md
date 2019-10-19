[![Build Status](https://travis-ci.org/Khachornchit/Java-Spring-Boot.svg?branch=master)](https://travis-ci.org/Khachornchit/Java-Spring-Boot)

# Spring Boot

Spring Boot is an open source Java-based framework used to create a micro Service. Most Spring Boot applications need very little Spring configuration. Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".

This is a sample project of using Spring Boot to develop backend RESTful API function.

## Technology Stack
* Java, Spring Boot, RESTful API
* Gradle
* Travis CI | CICD Integration

## Setup Guide
* git clone git@github.com:Khachornchit/Java-Spring-Boot.git
* cd Java-Spring-Boot
* ./gradlew.bat build
* ./gradlew.bat bootRun

# REST API Endpoint
* http://localhost:8080/

## CRUD
* POST /customers
* GET /customers
* GET /customers/{id}
* PUT /customers/{id}
* DELETE /customers/{id}

## Miscellaneous
* git update-index --chmod=+x gradlew