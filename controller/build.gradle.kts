plugins {
    kotlin("jvm") version "1.9.24"
}

dependencies {
    implementation(":app")
}

repositories {
    mavenCentral()
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
