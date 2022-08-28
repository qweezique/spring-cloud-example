docker rm gateway -f
docker run -d \
--name=gateway \
--env="RABBITMQ_SERVICE_HOST=rabbitmq-cloudbus" \
--env="DISCOVERY_SERVICE_URL=eureka-server:8761" \
--env="SPRING_PROFILES_ACTIVE=default" \
--network="myTestNetwork" \
-p 0.0.0.0:8585:8585 \
local/gateway:latest

docker logs gateway -f