FROM openjdk:11
ARG JAR_FILE=netflix-oss-member/build/libs/*.jar
COPY ${JAR_FILE} netflix-member-0.0.1.jar
ENV	PROFILE dev
ENTRYPOINT ["java","-Dspring.profiles.active=${PROFILE}","-jar","netflix-member-0.0.1.jar"]
EXPOSE 60001