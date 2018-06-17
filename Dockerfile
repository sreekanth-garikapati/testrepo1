FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/springboot2-1.0-SNAPSHOT.jar postalsearch.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/postalsearch.jar"]