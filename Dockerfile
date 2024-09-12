FROM openjdk:17-alpine
WORKDIR /app
COPY target/*.jar /app/fabric_query.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/app/fabric_query.jar"]