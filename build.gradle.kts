// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Dependencies.Gradle.ANDROID_BUILD_PLUGIN) version(Versions.ANDROID_BUILD_PLUGIN)  apply false
    id(Dependencies.Gradle.LIBRARY_BUILD_PLUGIN) version(Versions.LIBRARY_BUILD_PLUGIN) apply false
    id(Dependencies.Gradle.KOTLIN_BUILD_PLUGIN) version(Versions.KOTLIN_BUILD_PLUGIN) apply false
}

tasks.register ("clean", Delete::class) {
    delete(rootProject.buildDir)
}