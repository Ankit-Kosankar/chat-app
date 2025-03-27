FROM openjdk:21-jdk-slim

ENV APP_NAME=eureka-server.jar \
			APP_PORT=9090
			
WORKDIR /app

COPY build/libs/*.jar $APP_NAME

EXPOSE $APP_PORT

ENTRYPOINT [ "java" , "-jar" ,"eureka-server.jar"]