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



