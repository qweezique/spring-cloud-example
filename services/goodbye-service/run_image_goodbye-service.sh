docker run -d \
--name=goodbye-service \
--env="RABBITMQ_SERVICE_HOST=host.docker.internal" \
--env="DISCOVERY_SERVICE_URL=http://eureka-server:8761/eureka/" \
--network="myTestNetwork" \
-p 0.0.0.0:8181:8181 \
goodbye-service


docker run -d \
--name=goodbye-service \
--env="RABBITMQ_SERVICE_HOST=rabbitmq-cloudbus" \
--env="DISCOVERY_SERVICE_URL=http://eureka-server:8761/eureka/" \
--network="myTestNetwork" \
-p 0.0.0.0:8282:8282 \
goodbye-service