docker run -d \
--name=gateway \
--network=myTestNetwork \
--env="DISCOVERY_SERVICE_URL=http://eureka-server:8761/eureka/" \
-p 0.0.0.0:8585:8585 \
gateway