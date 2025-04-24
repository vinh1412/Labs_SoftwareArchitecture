FROM openjdk:17
WORKDIR /app
COPY target/identity-service.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]