FROM openjdk:17
WORKDIR /app
COPY target/payment-service.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]