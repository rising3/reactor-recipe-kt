import groovy.lang.GroovySystem
import java.time.ZoneId
import java.time.ZonedDateTime

plugins {
    eclipse
    idea
    id("org.jetbrains.kotlin.jvm") version "1.4.20"
}

group = "com.github.rising3"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation(platform("io.projectreactor:reactor-bom:2020.0.6"))
    implementation("io.projectreactor:reactor-core")

    testImplementation(platform("org.junit:junit-bom:5.7.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation("io.projectreactor:reactor-test")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    test {
        useJUnitPlatform()
    }
}
