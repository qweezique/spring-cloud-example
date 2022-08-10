plugins {
	id("org.springframework.boot")
	id("io.spring.dependency-management")
	id ("org.jetbrains.kotlin.plugin.jpa")
	id("org.jetbrains.kotlin.plugin.allopen")
	kotlin("jvm")
	kotlin("plugin.spring")
}

allOpen {
	annotations("javax.persistence.Entity", "javax.persistence.MappedSuperclass", "javax.persistence.Embedabble")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-web")

	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation(libs.jsonwebtoken.impl)
	implementation(libs.jsonwebtoken.jackson)

	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.springframework.cloud:spring-cloud-starter")
	implementation("org.springframework.cloud:spring-cloud-starter-config")
	implementation("org.springframework.cloud:spring-cloud-starter-bus-amqp")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
	implementation("org.springframework.cloud:spring-cloud-starter-bootstrap")

	implementation(libs.postgresql)
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	implementation(libs.kotlin.logger)
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
}