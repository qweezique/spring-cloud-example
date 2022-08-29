docker stop config-server
docker rm config-server -f
docker run -d \
--name=config-server \
--env="RABBITMQ_SERVICE_HOST=rabbitmq-cloudbus" \
--env="DISCOVERY_SERVICE_URL=eureka-server:8761" \
--env="SPRING_PROFILES_ACTIVE=local" \
--network="myTestNetwork" \
-p 8888:8888 \
local/config-server:latest
docker logs config-server -f