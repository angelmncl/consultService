FROM openjdk:11-jdk
COPY target/*.jar /app.jar
VOLUME /tmp
EXPOSE 8080
CMD java -Djava.security.egd=file:/dev/./urandom -jar /app.jar