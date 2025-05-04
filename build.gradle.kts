plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.arrow-kt:arrow-core:1.2.4")
    implementation("io.insert-koin:koin-core:4.0.2")
    testImplementation(kotlin("test"))

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    //Kotest
    testImplementation("io.kotest:kotest-assertions-core:5.7.2")
    testImplementation("io.kotest:kotest-runner-junit5:5.7.2")
    //Google Truth
    testImplementation("com.google.truth:truth:1.4.2")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
}