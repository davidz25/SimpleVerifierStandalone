pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        maven {
            url = uri("http://adt-proxy.uplink2.goog:999/6FQNZK6dQ5a5yzunVLtfPQ")
            isAllowInsecureProtocol = true
            mavenContent {
                includeGroup("com.android.identity")
            }
        }
        mavenCentral()
        maven("https://jitpack.io") {
            mavenContent {
                includeGroup("com.github.yuriy-budiyev")
            }
        }
        mavenLocal()
    }
}

rootProject.name = "SimpleVerifierStandalone"
include(":app")
