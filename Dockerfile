

FROM amazoncorretto:8
COPY target/proyecto-0.0.1-SNAPSHOT.jar proyecto-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/proyecto-0.0.1-SNAPSHOT.jar"]
