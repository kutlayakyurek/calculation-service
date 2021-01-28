# Sample Calculation Service Project With Java

Sample dockerized application for mathematical calculations

## Introduction

This project aims for implementing simple dockerized Spring Boot application

## How To Run

Just build the jar file with Maven and run it with command below. You can use any text based file with the format specified below. 

# Local
docker run -d -p 8080:8080 calculation-service:v1

# AWS
Deploy CDK and take the service url for requests

## How To Test

Please use any restful client to make request similar to the one below:

GET localhost:8080/factorial?number=5

GET http://platf-calcu-1h0go4t5510fb-1705030834.eu-west-1.elb.amazonaws.com/factorial?number=-1 (Your domain would be different)

### Status

- ![#f03c15](https://placehold.it/15/f03c15/000000?text=+) `Urgent Things to Do`

CI/CD job implementation
  
- ![#c5f015](https://placehold.it/15/c5f015/000000?text=+) `Test Coverage`
  
- ![#1589F0](https://placehold.it/15/1589F0/000000?text=+) `Requests`
