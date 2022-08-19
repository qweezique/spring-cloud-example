docker run -d \
--name=hello-service \
--env="RABBITMQ_SERVICE_HOST=host.docker.internal" \
--env="DISCOVERY_SERVICE_URL=http://eureka-server:8761/eureka/" \
--network="myTestNetwork" \
-p 0.0.0.0:8181:8181 \
hello-service


docker run -d \
--name=hello-service \
--env="RABBITMQ_SERVICE_HOST=rabbitmq-cloudbus" \
--env="DISCOVERY_SERVICE_URL=http://eureka-server:8761/eureka/" \
--network="myTestNetwork" \
-p 0.0.0.0:8181:8181 \
hello-service