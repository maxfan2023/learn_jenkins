FROM openjdk:21

COPY /target/MySprDockerApp.jar myapp.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","./myapp.jar"]