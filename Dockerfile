FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/
COPY --from=build /build/libs/FinalWorkAPI-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
