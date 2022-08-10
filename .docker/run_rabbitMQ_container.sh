#rabbitmq for Config server/clients refresh configs by /actuator/busrefresh
docker run  -p 15672:15672 -p 5672:5672 rabbitmq:3-management