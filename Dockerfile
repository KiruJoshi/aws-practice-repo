FROM openjdk:8
COPY target/awscicdproject-docker.jar  awscicdproject-docker.jar
EXPOSE 8080
CMD ["java", "-jar", "/awscicdproject-docker.jar"]
