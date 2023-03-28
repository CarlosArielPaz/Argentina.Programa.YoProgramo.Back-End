#FROM eclipse-temurin:19.0.2_7-jre-jammy
FROM amazoncorretto:19.0.2

MAINTAINER CarlosArielPaz@gmail.com

COPY ./portfolio.jar /

EXPOSE 8080

ENTRYPOINT ["java","-jar","/portfolio.jar"]