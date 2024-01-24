plugins {
    id("java")
}

val projectGroup: String by project
val applicationVersion: String by project


group = projectGroup
version = applicationVersion

repositories {
    mavenCentral()
}

java {
    val sourceCompatibility: String by project
    setSourceCompatibility(sourceCompatibility)
}

dependencies {
    val jUnitVersion: String by project
    testImplementation(platform("org.junit:junit-bom:$jUnitVersion"))
    testImplementation("org.junit.jupiter:junit-jupiter:$jUnitVersion")
}

tasks.test {
    useJUnitPlatform()
}