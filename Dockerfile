# Use openjdk:21-jdk-alpine as the base image
FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu

# Set the working directory
WORKDIR /app

# Copy the built JAR file from the target directory to the Docker image
COPY target/spring-boot-demo-0.0.1-SNAPSHOT.jar app.jar

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
