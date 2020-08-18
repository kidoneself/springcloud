
#FROM java:8
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} /
EXPOSE 3001
ENTRYPOINT ["java","-jar","${JAR_FILE}"]
