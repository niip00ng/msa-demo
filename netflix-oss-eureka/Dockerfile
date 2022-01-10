FROM openjdk:11
ARG JAR_FILE=netflix-oss-eureka/build/libs/*.jar
COPY ${JAR_FILE} netflix-eureka-0.0.1.jar
ENV	PROFILE dev
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}","-jar","netflix-eureka-0.0.1.jar"]
EXPOSE 8761