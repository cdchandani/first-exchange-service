FROM openjdk:17-alpine
ADD /build/libs/first-exchange-service-0.0.1-SNAPSHOT.jar first-exchange-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "first-exchange-service-0.0.1-SNAPSHOT.jar"]
