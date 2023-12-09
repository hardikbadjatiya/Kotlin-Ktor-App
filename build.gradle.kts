val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "1.9.10"
    id("io.ktor.plugin") version "2.3.5"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.10"
}

group = "com.amex"
version = "0.0.1"

application {
    mainClass.set("com.amex.ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
    maven(url ="https://jitpack.io")
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-cors-jvm")
    implementation("io.ktor:ktor-server-openapi")
    implementation("io.ktor:ktor-server-swagger-jvm")
    implementation("io.github.smiley4:ktor-swagger-ui:1.0.1")
    implementation("io.ktor:ktor-server-call-logging-jvm")
    implementation("io.ktor:ktor-server-metrics-jvm")
    implementation("io.ktor:ktor-server-content-negotiation-jvm")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm")
    implementation("io.ktor:ktor-serialization-jackson-jvm")
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-datetime-jvm:0.5.0")
// https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-serialization-runtime
    // implementation("org.jetbrains.kotlinx", "kotlinx-serialization-runtime", "1.0-M1-SNAPSHOT")
// https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-serialization-runtime
//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:1.0-M1-1.4.0-rc")

    implementation("com.mysql:mysql-connector-j:8.1.0")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
    implementation("org.jetbrains.exposed:exposed:0.17.14")
    implementation("com.h2database:h2:2.1.214")
    implementation("joda-time:joda-time:2.12.5")
}
