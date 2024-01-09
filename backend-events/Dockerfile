# Use official OpenJDK image as the base image
FROM openjdk:19.0.1

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at the specified working directory
COPY target/backend-events-0.0.1-SNAPSHOT.jar /app/backend-events.jar

# Expose port 7700
EXPOSE 7700

# Specify the command to run on container startup
CMD ["java", "-jar", "backend-events.jar"]



