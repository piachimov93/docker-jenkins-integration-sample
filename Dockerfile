FROM openjdk:17
EXPOSE 8081
COPY target/springboot-mongo-docker.jar springboot-mongo-docker.jar
ENTRYPOINT ["java", "-jar", "/springboot-mongo-docker.jar"]