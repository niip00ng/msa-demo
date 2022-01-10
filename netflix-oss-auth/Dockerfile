FROM openjdk:11
ARG JAR_FILE=netflix-oss-auth/build/libs/*.jar
COPY ${JAR_FILE} netflix-auth-0.0.1.jar
ENV	PROFILE dev
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}","-jar","netflix-auth-0.0.1.jar"]
EXPOSE 60002