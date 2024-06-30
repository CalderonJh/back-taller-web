FROM openjdk:17.0.2
LABEL authors="jhonc"
VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]