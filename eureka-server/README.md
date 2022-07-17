### Eureka-server (Discovery-service)
Полностью замостоятельный сервис с минимальным набором конфигураций.

- Указываем в application.yml имя сервиса [application.yml](../eureka-server/src/main/resources/application.yml)
- Включаем _@EnableEurekaServer_ в [EurekaServerApplication](../eureka-server/src/main/kotlin/qwee/zique/eurekaserver/EurekaServerApplication.kt) 
