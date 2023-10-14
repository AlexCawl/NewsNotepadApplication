plugins {
    id("com.android.library") apply false
    id("org.jetbrains.kotlin.android")
    id("kotlinx-serialization")
    kotlin("kapt")
}

dependencies {
    // Serialization
    implementation(ApplicationDeps.Serialization.core)
    implementation(ApplicationDeps.Serialization.json)

    // Coroutines
    implementation(ApplicationDeps.Kotlin.coroutines)
    implementation(ApplicationDeps.Android.coroutinesExtensions)

    // Dagger
    implementation(ApplicationDeps.Dagger.dagger)
    kapt(ApplicationDeps.Dagger.compiler)

    // Testing
    testImplementation(ApplicationDeps.Test.junit)
}