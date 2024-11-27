FROM openjdk:21

WORKDIR /app

COPY build/libs/GcTesting_K6-0.0.1-SNAPSHOT.jar gc-testing-k6.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "gc-testing-k6.jar"]