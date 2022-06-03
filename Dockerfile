FROM maven:3.8.5-openjdk-18-slim as BUILDER
ARG VERSION=0.0.1-SNAPSHOT
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/


RUN mvn clean package
COPY target/Spring-Boot-Course-${VERSION}.jar target/application.jar

FROM openjdk:18-jdk-slim
WORKDIR /app/

COPY --from=BUILDER /build/target/application.jar /app/

CMD java -jar /app/application.jar