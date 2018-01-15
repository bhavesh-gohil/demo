FROM openjdk:8
ADD target/dockerApplication.jar dockerApplication.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar" "/dockerApplication.jar"]
