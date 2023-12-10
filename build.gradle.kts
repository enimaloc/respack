plugins {
    id("java")
    id("org.sonarqube") version "3.5.0.2730"
}

group = "fr.divineexodus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sonar {
    properties {
        property("sonar.projectKey", "DivineExodus_server_AYxTmxkxY2D0l8qiaVAK")
    }
}