# SpringBootH2Project
Spring Boot and H2 database demo project

## Create a Spring Boot application

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
FROM openjdk:8-jdk-alpine
WORKDIR /opt/app
COPY target/SpringBootH2Demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
```
### Check if the docker is installed
```
docker --version
```
### Check if the docker daemon is running

### Run the below mentioned docker command to build the docker image created above.
```
docker build -t=app:latest .
```
![image](https://github.com/itsnehagarg/SpringBootH2Project/assets/20385826/b731ccd8-4d97-407a-95cc-9595b56106a0)


