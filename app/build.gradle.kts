plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {

    compileSdk = Versions.Build.COMPILE_SDK

    defaultConfig {
        applicationId = "ex.arro.cleanarchitecturedemoapp"
        minSdk = Versions.Build.MIN_SDK
        targetSdk = Versions.Build.TARGET_SDK
        versionCode = Versions.Build.VERSION_CODE
        versionName = Versions.Build.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
        }
    }
}

dependencies {

    implementation(Dependencies.Android.KTX)
    implementation(Dependencies.Android.APPCOMPAT)
    implementation(Dependencies.Google.MATERIAL)
    implementation(Dependencies.Android.CONSTRAINT_LAYOUT)
    testImplementation(Dependencies.JUNIT)
    androidTestImplementation(Dependencies.Test.EXT_JUNIT)
    androidTestImplementation(Dependencies.Test.ESPRESSO)
}