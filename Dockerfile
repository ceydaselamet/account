FROM maven:latest AS build

COPY pom.xml mvnw ./
RUN mvn dependency:resolve

COPY . .
RUN mvn package

FROM openjdk:11
WORKDIR /app
COPY --from=build target/*.jar ./account-api.jar
ENTRYPOINT ["java", "-jar", "account-api.jar"]
