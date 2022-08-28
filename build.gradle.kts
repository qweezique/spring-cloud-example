import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }
}
extra["springCloudVersion"] = "2021.0.3"

plugins {
    id("org.springframework.boot") version "2.7.1" apply false
    id("org.jetbrains.kotlin.plugin.jpa") version "1.5.21" apply false
    id("org.jetbrains.kotlin.plugin.allopen") version "1.5.21" apply false
    id("com.google.cloud.tools.jib") version "3.2.1" apply false    //https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin#setup
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.21" apply false
    kotlin("plugin.spring") version "1.6.21" apply false
}

allprojects {
    group = "qwee.zique"
    val versionFromEnv = System.getProperty("artifact_version")
    version = if (!versionFromEnv.isNullOrEmpty()) versionFromEnv else "0.0.1-SNAPSHOT"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }
    tasks.withType<Test> {
        useJUnitPlatform()
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
        }
    }

    subprojects {
        repositories {
            mavenCentral()
        }
        apply {
            plugin("io.spring.dependency-management")
        }
    }
}