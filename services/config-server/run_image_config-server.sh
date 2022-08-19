docker run -d \
--name=config-server \
--env="RABBITMQ_SERVICE_HOST=host.docker.internal" \
#--env="RABBITMQ_SERVICE_HOST=rabbitmq-cloudbus" \
--env="DISCOVERY_SERVICE_URL=http://host.docker.internal:8761/eureka/" \
-p 0.0.0.0:8888:8888 \
config-server


docker run -d \
--name=config-server \
--env="RABBITMQ_SERVICE_HOST=rabbitmq-cloudbus" \
--env="DISCOVERY_SERVICE_URL=http://eureka-server:8761/eureka/" \
--network="myTestNetwork" \
-p 0.0.0.0:8888:8888 \
config-server