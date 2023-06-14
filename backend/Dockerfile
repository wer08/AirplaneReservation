# Use a base image with Java and Maven pre-installed
FROM maven AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and download the dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the source code
COPY src ./src

# Build the application
RUN mvn package -DskipTests

# Use a lightweight base image with Java only
FROM openjdk

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the previous stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port your Spring application listens on
EXPOSE 8080

# Set the command to run your Spring application
CMD ["java", "-jar", "app.jar"]
