plugins {
    `kotlin-dsl`
    kotlin("jvm") version embeddedKotlinVersion
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven {
        name = "PaperMC"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly "io.papermc.paper:paper-api:1.18.2" // e.g. 1.18.2, 1.20.4
    compileOnly "com.velocitypowered:velocity-api:4.0.0" // e.g. 3.2.0
}
