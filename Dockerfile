FROM eclipse-temurin:19.0.2_7-jre-jammy

MAINTAINER CarlosArielPaz@gmail.com

COPY ./dist /

ENTRYPOINT ["java","-jar","/portfolio.jar"]