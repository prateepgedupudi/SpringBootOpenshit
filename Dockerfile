FROM openjdk:8
ADD target/SpringBootOpenShift-0.0.1.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]