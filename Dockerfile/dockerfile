# Use a base image with Java 11
FROM openjdk:11-jre-slim

# Create a directory for the application
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar

# Expose the port your app runs on (if applicable)
# EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]




# # Use official Ubuntu base image
# FROM ubuntu:22.04

# # Install necessary packages
# RUN apt-get update && \
#     apt-get install -y openjdk-17-jdk && \
#     apt-get clean && \
#     rm -rf /var/lib/apt/lists/*

# # Set environment variables
# ENV JAVA_HOME /usr/lib/jvm/java-17-openjdk-amd64
# ENV PATH $JAVA_HOME/bin:$PATH

# # Create app directory
# WORKDIR /app

# # Copy the built jar file (rename it to app.jar if needed)
# COPY target/good-morning-message-1.0-SNAPSHOT.jar app.jar

# # Expose port if your application uses one
# # EXPOSE 8080

# # Set the entry point to run your application
# ENTRYPOINT ["java", "-jar", "app.jar"]