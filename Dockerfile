# Use a base image with Java 11
FROM openjdk:11-jre-slim

# Create a directory for the application
WORKDIR /app

#Modify the jar file name to app.jar
COPY app/*.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
