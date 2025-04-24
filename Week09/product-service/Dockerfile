FROM openjdk:17
WORKDIR /app
COPY target/product-service.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]