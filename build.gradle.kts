// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/google") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/groups/public/") }
        maven { url = uri("https://maven.aliyun.com/nexus/content/repositories/gradle-plugin") }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.8.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}