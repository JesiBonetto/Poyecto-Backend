

FROM amazoncorreto:8-alpine-jdk
COPY target/proyecto-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
