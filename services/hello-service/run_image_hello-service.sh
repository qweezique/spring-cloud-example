docker run -d \
--name=hello-service \
--env="RABBITMQ_SERVICE_HOST=host.docker.internal" \
--env="DISCOVERY_SERVICE_URL=http://host.docker.internal:8761/eureka/" \
-p 0.0.0.0:8181:8181 \
hello-service