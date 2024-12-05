FROM gradle:8.2-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle bootJar --no-daemon

FROM openjdk:21-jdk-slim
EXPOSE 8080
COPY --from=build /app/build/libs/FinalWorkAPI-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
