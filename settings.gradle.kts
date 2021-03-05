pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
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
        const val shared = ":shared"
    }

    object Features

    object Libraries

    val applications
        get() = arrayOf(
            ProjectBean(Applications.kmmSample)
        )

    val multiplatformLibraries
        get() = arrayOf(
            ProjectBean(MultiplatformLibraries.shared)
        )

    val features
        get() = emptyArray<ProjectBean>()

    val libraries
        get() = emptyArray<ProjectBean>()
}
