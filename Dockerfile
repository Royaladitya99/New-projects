FROM openjdk:8-jdk-alpine
WORKDIR /opt/app
COPY target/SpringBootH2Demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]