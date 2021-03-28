object Versions {
    const val accompanist = "0.6.0"
    const val activityCompose = "1.3.0-alpha03"

    const val compose = "1.0.0-beta03"
    const val composeNav = "1.0.0-alpha09"

    const val jupiter = "5.7.1"

    const val kermit = "0.1.8"
    const val koin = "3.0.1-alpha-6"
    const val kotlin = "1.4.31"
    const val kotlinCoroutines = "1.4.2-native-mt"
    const val kotlinxSerialization = "1.0.1"
    const val ktor = "1.5.2"

    const val lifecycle = "2.3.0"
    const val lifecycleExtension = "2.2.0"

    const val resourcesGenerator = "0.15.0"

    const val sqlDelight = "1.4.2"
    const val sqliteJdbcDriver = "3.30.1"
}

object AndroidSdk {
    const val min = 24
    const val compile = 30
    const val target = compile
}

object ApplicationPackage {
    const val appPackage = "com.nasalevich.kmm"

    const val appResources = "$appPackage.appResources"
    const val shared = "$appPackage.shared"
}

object Activity {
    const val compose = "androidx.activity:activity-compose:${Versions.activityCompose}"
}

object Compose {
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
    const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"

    const val accompanist= "dev.chrisbanes.accompanist:accompanist-coil:${Versions.accompanist}"

    const val navigation = "androidx.navigation:navigation-compose:${Versions.composeNav}"
}

object Coroutines {
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
}

object Jupiter {
    const val api = "org.junit.jupiter:junit-jupiter-api:${Versions.jupiter}"
    const val params = "org.junit.jupiter:junit-jupiter-params:${Versions.jupiter}"
}

object Ktor {
    const val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
    const val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
    const val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
    const val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"

    const val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
    const val clientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"
}

object Koin {
    const val core = "io.insert-koin:koin-core:${Versions.koin}"
    const val test = "io.insert-koin:koin-test:${Versions.koin}"
    const val android = "io.insert-koin:koin-android:${Versions.koin}"
    const val compose = "io.insert-koin:koin-androidx-compose:${Versions.koin}"
}

object Lifecycle {
    const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtension}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
}

object Logging {
    const val kermit = "co.touchlab:kermit:${Versions.kermit}"
}

object Serialization {
    const val core = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerialization}"
}

object SqlDelight {
    const val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
    const val coroutineExtensions = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
    const val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"

    const val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
    const val nativeDriverMacos = "com.squareup.sqldelight:native-driver-macosx64:${Versions.sqlDelight}"
    const val jdbcDriver = "org.xerial:sqlite-jdbc:${Versions.sqliteJdbcDriver}"
    const val sqlliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
}
