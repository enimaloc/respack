plugins {
    id("java")
    id("java-library")
    id("org.sonarqube") version "4.4.1.3373"
    id("jacoco-report-aggregation")
}

group = "fr.enimaloc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("net.kyori:adventure-api:4.14.0")

    implementation("org.slf4j:slf4j-api:2.0.5")
    // Testing
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

sonar {
    properties {
        property("sonar.projectKey", "enimaloc_respack_AYz32ZJPY2D0l8qiaVBK")
    }
}

tasks.jacocoTestReport {
    reports {
        xml.required = true
        csv.required = false
        html.outputLocation = layout.buildDirectory.dir("jacocoHtml")
    }
}

tasks.check {
    dependsOn(tasks.named<JacocoReport>("testCodeCoverageReport"))
}