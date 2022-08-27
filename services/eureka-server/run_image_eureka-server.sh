docker run -d \
--name=eureka-server \
--network=myTestNetwork \
--env="DISCOVERY_SERVICE_URL=http://eureka-server:8761/eureka/" \
-p 0.0.0.0:8761:8761 \
local/eureka-server:0.0.1-SNAPSHOT