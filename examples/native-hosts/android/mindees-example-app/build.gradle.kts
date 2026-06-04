plugins {
    id("com.android.application")
}

android {
    namespace = "dev.mindees.example"
    compileSdk = 36

    defaultConfig {
        applicationId = "dev.mindees.example"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "0.0.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    testOptions {
        unitTests {
            isReturnDefaultValues = true
        }
    }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(project(":mindees-host"))
    implementation("app.cash.quickjs:quickjs-android:0.9.2")

    testImplementation("junit:junit:4.13.2")
    testImplementation("org.json:json:20231013")
}
