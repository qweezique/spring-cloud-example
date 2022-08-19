FROM azul/zulu-openjdk:17.0.2-17.32.13-arm64
ARG JAR_FILE=/build/libs/goodbye-service-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
EXPOSE 8282
ENTRYPOINT ["java","-jar","app.jar"]
