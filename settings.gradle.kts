rootProject.name = "spring-cloud-example"
include("services:config-server")
include("services:eureka-server")

include("services:gateway")
include("services:auth-service")
include("services:goodbye-service")
include("services:hello-service")