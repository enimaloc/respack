plugins {
    id("java")
    id("org.sonarqube") version "3.5.0.2730"
}

group = "fr.divineexodus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    // Minestom - base
    implementation("dev.hollowcube:minestom-ce:8715f4305d") // using forked version of Minestom for 1.20.1

    // Testing
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sonar {
    println("Using ${System.getenv("SONAR_HOST_URL")} as host")
    properties {
        property("sonar.projectKey", "DivineExodus_server_AYxTmxkxY2D0l8qiaVAK")
    }
}