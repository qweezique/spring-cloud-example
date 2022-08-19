FROM azul/zulu-openjdk:17.0.2-17.32.13-arm64
ARG JAR_FILE=/build/libs/gateway-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} gateway.jar
EXPOSE 8585
ENTRYPOINT ["java","-jar","gateway.jar"]
