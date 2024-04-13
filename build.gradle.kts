//buildscript {
//    val kotlin_version = "1.6.10"
//    repositories {
//        google() // Add Google repository
//        mavenCentral() // Replace jcenter() with mavenCentral() as recommended
//    }
//    dependencies {
//        classpath("com.android.tools.build:gradle:7.1.3")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
//    }
//}
//
//plugins {
//    id("com.android.application") version "7.1.0"
//    id("org.jetbrains.kotlin.android") version "1.6.10" // Use the same version as kotlin_version
//}
//
//allprojects {
//    repositories {
//        google() // Add Google repository
//        mavenCentral() // Replace jcenter() with mavenCentral() as recommended
//    }
//}
//
//tasks.register("clean") {
//    doLast {
//        delete(rootProject.buildDir)
//    }
//}


plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.0" apply false
}