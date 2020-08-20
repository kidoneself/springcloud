
#FROM java:8
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} springcloud.jar
EXPOSE 3001
EXPOSE 3002
ENTRYPOINT ["java","-jar","/springcloud.jar"]
