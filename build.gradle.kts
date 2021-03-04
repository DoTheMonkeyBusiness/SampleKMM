buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.0-M1")
        classpath("com.android.tools.build:gradle:7.0.0-alpha08")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}