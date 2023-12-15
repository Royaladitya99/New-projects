# 🌻 SpringBoot and H2 database Project
Spring Boot and H2 database demo project

## Create a Spring Boot application

### 🌼 Starting with Spring Initializr
1. Navigate to https://start.spring.io.
2. Choose either Gradle or Maven and the language you want to use. I have used Maven in this application.
3. Click Dependencies and select Rest Repositories, Spring Data JPA, and H2 Database.
4. Click Generate.
5. Add the relevant classes such as Controller, Repository & Entity class.

## Run Maven command to build the application
```
mvn clean install
```

## Generate the target spring boot jar file by using the below command:
```
mvn spring::boot run
```

## Dockerizing a Spring Boot Application: Build a Spring Boot Docker image
Created a Dockerfile with the below contents:
```
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```
### Check if the docker is installed
```
docker --version
```
### Check if the docker daemon is running

### Run the below mentioned docker command to build the docker file created above.
```
docker build -t myorg/myapp .
```

### Let's run the docker image using the below command:
```
docker run -p 8080:8080 myorg/myapp
```

![image](https://github.com/itsnehagarg/SpringBootH2Project/assets/20385826/3e2fd91e-6fa3-4243-9801-4f30083db180)

#### Test the application using Postman:

Add the customers by using below link: http://localhost:8080/newcustomer

![image](https://github.com/itsnehagarg/SpringBootH2Project/assets/20385826/a9a6007e-39de-4dbc-84ed-145e105c80ac)

Get the list of customers:

http://localhost:8080/customers

🌻Yay! We created and dockerized a Spring Boot application.

Thank you for visting! Happy Learning!

#### References:

https://spring.io/guides/gs/accessing-data-rest/

https://spring.io/guides/topicals/spring-boot-docker/


