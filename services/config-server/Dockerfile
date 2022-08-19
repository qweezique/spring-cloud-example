FROM azul/zulu-openjdk:17.0.2-17.32.13-arm64
ARG JAR_FILE=/build/libs/config-server-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} config-server.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","config-server.jar"]
