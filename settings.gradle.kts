rootProject.name = "mod-and-plugin"

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/") {
            name = "papermc"
        }
        maven("https://maven.fabricmc.net/") {
            name = "fabricmc"
        }
    }
}

include("api", "plugin", "mod")
