FROM openjdk:21-jdk-slim

ENV APP_NAME=user-service.jar \
			APP_PORT=9091
			
WORKDIR /app

#RUN apt-get update && \
#    apt-get install -y mysql-server && \
#    rm -rf /var/lib/apt/lists/*

# Set environment variables for MySQL
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=userservice
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=root

# Expose the MySQL port
EXPOSE 3306

CMD ["mysqld", "--init-db-dir=/docker-entrypoint-initdb.d"]

COPY build/libs/*.jar $APP_NAME

EXPOSE $APP_PORT

ENTRYPOINT [ "java" , "-jar" ,"user-service.jar"]