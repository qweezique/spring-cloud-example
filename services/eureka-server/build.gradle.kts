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
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

jib {
    from.image = "azul/zulu-openjdk:17.0.2-17.32.13-arm64"
    to.image = "local/${project.name}:${project.version}"
    container.creationTime = Instant.now().toString()
}
tasks.register("docker-run") {
    dependsOn("jibDockerBuild")
    doLast {
        exec {
            commandLine("./run_image_eureka-server.sh")
        }
    }
}
tasks.register("hello") {
    doFirst {
        println("hello Gradle ${gradle.gradleVersion} from ${project.name}")
    }
}
tasks.register("goodbye") {
    dependsOn("hello")
    doFirst {
        println("goodbye Gradle")
    }
}