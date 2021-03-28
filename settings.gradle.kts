pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
rootProject.name = "KMM"

registerModules(
    *Modules.applications,
    *Modules.multiplatformLibraries,
    *Modules.features,
    *Modules.libraries
)

fun Settings.registerModules(vararg libs: ProjectBean) {
    libs.forEach {
        include(it.name)

        if (it.path.isNotEmpty()) {
            project(it.name).projectDir = File(rootDir, it.path)
        }
    }
}

class ProjectBean(
    val name: String,
    val path: String = ""
)

object Modules {

    object Applications {
        const val kmmSample = ":androidApp"
    }

    object MultiplatformLibraries {
        const val appResources = ":appResources"
        const val shared = ":shared"
    }

    object Features

    object Libraries {
        const val core = ":core"
        const val navigation = ":navigation"
    }

    val applications
        get() = arrayOf(
            ProjectBean(Applications.kmmSample)
        )

    val multiplatformLibraries
        get() = arrayOf(
            ProjectBean(MultiplatformLibraries.shared),
            ProjectBean(MultiplatformLibraries.appResources, "sources/base/shared/appResources")
        )

    val features
        get() = emptyArray<ProjectBean>()

    val libraries
        get() = arrayOf(
            ProjectBean(Libraries.core, "sources/base/android/core"),
            ProjectBean(Libraries.navigation, "sources/library/android/navigation")
        )
}
