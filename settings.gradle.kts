dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
//        mavenLocal()
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
        maven("https://jitpack.io")
        mavenCentral()
    }
}

rootProject.name = "H00-Student"
