plugins {
    id("felis-dam") version "1.7.4-alpha"
}

loaderMake {
    version = "1.20.5"
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("felis:felis:1.2.2-alpha")
    implementation("felis:kittens:1.2.1-alpha")
}

tasks.withType(ProcessResources::class.java) {
    filesMatching("mods.toml") {
        expand("version" to project.version)
    }
}
