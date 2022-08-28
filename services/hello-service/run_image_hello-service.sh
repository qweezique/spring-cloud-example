docker rm hello-service -f
docker run -d \
--name=hello-service \
--env="RABBITMQ_SERVICE_HOST=rabbitmq-cloudbus" \
--env="DISCOVERY_SERVICE_URL=eureka-server:8761" \
--env="SPRING_PROFILES_ACTIVE=default" \
--network="myTestNetwork" \
-p 0.0.0.0:8181:8181 \
local/hello-service:latest

docker logs hello-service -f