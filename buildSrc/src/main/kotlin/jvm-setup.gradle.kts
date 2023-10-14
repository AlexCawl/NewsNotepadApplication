plugins {
    id("org.jetbrains.kotlin.jvm")
    id("kotlinx-serialization")
}

dependencies {
    // Serialization
    implementation(ApplicationDeps.Serialization.core)
    implementation(ApplicationDeps.Serialization.json)

    // Coroutines
    implementation(ApplicationDeps.Kotlin.coroutines)

    // Testing
    testImplementation(ApplicationDeps.Test.junit)
}