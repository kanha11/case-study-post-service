FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8010
ARG JAR_FILE=target/post-service-1.0.0.jar
ADD ${JAR_FILE} post-service-1.0.0.jar
ENTRYPOINT ["java","-jar","/post-service-1.0.0.jar"]
