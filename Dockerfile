# For Java 11, try this

# FROM adoptopenjdk/openjdk11:alpine-jre

FROM openjdk:8

EXPOSE 8000
ADD target/Authorization-Microservice-0.0.1-SNAPSHOT.jar Authorization-Microservice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Authorization-Microservice-0.0.1-SNAPSHOT.jar"]
