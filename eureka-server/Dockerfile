FROM azul/zulu-openjdk:17.0.2-17.32.13-arm64
ARG JAR_FILE=/build/libs/eureka-server-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} hello-service.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","hello-service.jar"]
