plugins {
    id("loader-make") version "1.4-ALPHA"
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("io.github.joemama:loader:1.0-ALPHA")
    implementation("io.github.joemama:api:1.0-ALPHA")
}

tasks.withType(ProcessResources::class.java) {
    filesMatching("mods.toml") {
        expand("version" to project.version)
    }
}
