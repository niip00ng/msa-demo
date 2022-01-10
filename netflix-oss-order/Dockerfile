FROM openjdk:11
ARG JAR_FILE=netflix-oss-order/build/libs/*.jar
COPY ${JAR_FILE} netflix-order-0.0.1.jar
ENV	PROFILE dev
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}","-jar","netflix-order-0.0.1.jar"]
EXPOSE 60003