plugins {
    kotlin("jvm") version "1.5.30"
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("dev.sankaran.saran:samplelibrary:0.0.1")
}