FROM openjdk:11
ARG JAR_FILE=netflix-gateway/build/libs/*.jar
COPY ${JAR_FILE} netflix-gateway-0.0.1.jar
ENV	PROFILE dev
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}","-jar","netflix-gateway-0.0.1.jar"]
EXPOSE 8080