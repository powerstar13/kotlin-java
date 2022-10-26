import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.5"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
    kotlin("jvm") version "1.6.21"
//    id("org.jetbrains.kotlin.plugin.allopen") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21" // allOpen을 대체할 수 있는 kotlin-spring
//    kotlin("plugin.noarg") version "1.6.21"
    kotlin("plugin.jpa") version "1.6.21" // noArg를 대체할 수 있는 kotlin-jpa
}

//allOpen {
//    annotations(
//        "org.springframework.boot.autoconfigure.SpringBootApplication",
//        "org.springframework.transaction.annotation.Transactional"
//    )
//}

//noArg {
//    annotation("javax.persistence.Entity")
//}

group = "study.kotlinjava"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    runtimeOnly("com.h2database:h2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
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
