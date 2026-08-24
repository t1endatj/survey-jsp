# ==========================================
# Stage 1: Build WAR application with Maven
# ==========================================
FROM maven:3.8-eclipse-temurin-8 AS build
WORKDIR /app

# Copy configuration and source code
COPY pom.xml .
COPY src ./src

# Build WAR package (skip tests for faster build)
RUN mvn clean package -DskipTests

# ==========================================
# Stage 2: Run with Apache Tomcat 9
# ==========================================
FROM tomcat:9.0-jdk8-corretto
WORKDIR /usr/local/tomcat

# Remove default Tomcat webapps
RUN rm -rf webapps/*

# Copy generated WAR file as ROOT.war to serve at root path (/)
COPY --from=build /app/target/*.war webapps/ROOT.war

# Default PORT environment variable (Render sets this dynamically)
ENV PORT=8080
EXPOSE 8080

# Dynamically bind Tomcat port to Render's $PORT on container startup
CMD ["sh", "-c", "sed -i \"s/port=\\\"8080\\\"/port=\\\"${PORT:-8080}\\\"/g\" conf/server.xml && catalina.sh run"]
