docker rm eureka-server -f
docker run -d \
--name=eureka-server \
--network="myTestNetwork" \
--env="DISCOVERY_SERVICE_URL=http://eureka-server:8761/eureka/" \
--env="SPRING_PROFILES_ACTIVE=local" \
-p 0.0.0.0:8761:8761 \
local/eureka-server:latest

docker logs eureka-server -f