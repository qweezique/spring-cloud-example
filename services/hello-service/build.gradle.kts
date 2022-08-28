import java.time.Instant

plugins {
	id("org.springframework.boot")
	id("io.spring.dependency-management")
	id("com.google.cloud.tools.jib")
	kotlin("jvm")
	kotlin("plugin.spring")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.springframework.cloud:spring-cloud-starter")
	implementation("org.springframework.cloud:spring-cloud-starter-config")
	implementation("org.springframework.cloud:spring-cloud-starter-bus-amqp")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
	implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")

	implementation(libs.kotlin.logger)
	implementation(libs.logback)

	testImplementation("org.springframework.boot:spring-boot-starter-test"){
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
}

jib {
	from.image = "azul/zulu-openjdk:17.0.2-17.32.13-arm64"
	to.image = "local/${project.name}:latest"
	container.creationTime = Instant.now().toString()
}
tasks.register("docker-run") {
	dependsOn("jibDockerBuild")
	doLast {
		exec {
			commandLine("./run_image_${project.name}.sh")
		}
	}
}