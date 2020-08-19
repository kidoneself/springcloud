
#FROM java:8
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ENV port ${port}
COPY ${JAR_FILE} springcloud.jar
EXPOSE ${port}
ENTRYPOINT ["java","-jar","/springcloud.jar"]
