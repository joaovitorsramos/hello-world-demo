  
FROM openjdk:11
ADD target/hello-world-pipeline-0.0.1-SNAPSHOT.jar hello-world.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "hello-world.jar"]