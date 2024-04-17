plugins {
    id("loader-make") version "1.6-ALPHA"
}

loaderMake {
    version = "1.20.4"
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("io.github.joemama:loader:1.1-ALPHA")
    implementation("io.github.joemama:api:1.1-ALPHA")
}

tasks.withType(ProcessResources::class.java) {
    filesMatching("mods.toml") {
        expand("version" to project.version)
    }
}
