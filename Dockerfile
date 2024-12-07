# Etapa de construcción (build)
FROM ubuntu:latest AS build

# Instalar dependencias necesarias
RUN apt-get update && apt-get install -y openjdk-21-jdk wget curl unzip

# Instalar Gradle
RUN wget https://services.gradle.org/distributions/gradle-8.10.2-bin.zip -P /tmp \
    && unzip /tmp/gradle-8.10.2-bin.zip -d /opt \
    && rm /tmp/gradle-8.10.2-bin.zip \
    && ln -s /opt/gradle-8.10.2/bin/gradle /usr/bin/gradle

# Configurar directorio de trabajo
WORKDIR /app

# Copiar todos los archivos del proyecto
COPY . .

# Compilar el proyecto y generar el archivo JAR
RUN ./gradlew clean bootJar --no-daemon

# Inspección para depuración
RUN echo "Verificando el contenido de build/libs:" && ls -R /app/build/libs

# Etapa final (run)
FROM openjdk:21-jdk-slim

# Configurar directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR
COPY --from=build /app/build/libs/FinalWorkAPI-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto de la aplicación
EXPOSE 8085

# Comando de inicio
ENTRYPOINT ["java", "-jar", "app.jar"]
