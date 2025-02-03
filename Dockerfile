# Use openjdk:21-jdk-alpine as the base image
FROM eclipse-temurin:21.0.6_7-jre-ubi9-minimal

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the target directory to the Docker image
COPY target/spring-boot-demo-0.0.1-SNAPSHOT.jar app.jar

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
