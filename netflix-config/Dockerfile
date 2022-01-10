FROM openjdk:11

ARG JAR_FILE=netflix-config/build/libs/*.jar
COPY ${JAR_FILE} netflix-config-0.0.1.jar
ENTRYPOINT ["java","-jar","netflix-config-0.0.1.jar"]

EXPOSE 8888