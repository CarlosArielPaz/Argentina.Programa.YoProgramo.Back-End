# App ➜ #YoProgramo

FROM eclipse-temurin:19.0.2_7-jre-jammy
#FROM amazoncorretto:19.0.2

LABEL author = "CarlosArielPaz@gmail.com"
LABEL version = "1.0.0"

WORKDIR /usr/local/app
COPY ./COPY /

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/portfolio-1.0.0.jar" ]
#CMD [ "java", "-jar", "/app.jar" ]