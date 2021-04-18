import Modules.MultiplatformLibraries

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(AndroidSdk.compile)

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(MultiplatformLibraries.appResources))

    implementation(Compose.material)
    implementation(Compose.runtime)
    implementation(Compose.ui)
}
