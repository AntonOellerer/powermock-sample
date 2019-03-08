plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.chargebee:chargebee-java:2.6.7")

    testImplementation("junit:junit:4.12")
    testImplementation("org.powermock:powermock-module-junit4:2.0.0")
    testImplementation("org.powermock:powermock-api-mockito2:2.0.0")
    testImplementation("org.powermock:powermock-module-junit4-rule-agent:2.0.0")
    testImplementation("org.mockito:mockito-core:2.25.0")

    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.4.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.4.0")
}

tasks.test {
    useJUnitPlatform()
}
