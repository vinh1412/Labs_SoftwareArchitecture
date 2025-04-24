FROM openjdk:17
WORKDIR /app
COPY target/api-gateway.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]